package DAO;

import Conexao.Conexao;
import Model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {

    public void cadastrarFornecedor(Fornecedor fornecedor) throws SQLException {

        String sql = """
                INSERT INTO Fornecedor (nome, cnpj)
                VALUES (?,?)
                """;
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getCnpj());
            ps.executeUpdate();
            System.out.println("\n[OK] Fornecedor cadastrado com sucesso!");
        }

    }

    public boolean existeCnpj(String cnpj) throws SQLException {
        boolean existe = false;

        String sql = """
                SELECT id, nome, cnpj 
                FROM Fornecedor 
                WHERE cnpj = ?
                """;
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cnpj);
            var rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
                System.err.println("\n[AVISO] CNPJ já cadastrado no sistema.");
            }
        }
        return existe;
    }

    public List<Fornecedor> listarFornecedores() throws SQLException {
        List<Fornecedor> fornecedores = new ArrayList<>();

        String sql = """
                SELECT id, nome, cnpj
                FROM Fornecedor
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCnpj(rs.getString("cnpj"));

                fornecedores.add(fornecedor);
            }
        }
        return fornecedores;
    }
}

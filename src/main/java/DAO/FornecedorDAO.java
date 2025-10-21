package DAO;

import Conexao.Conexao;
import Model.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDAO {

    public void cadastrarFornecedor(Fornecedor fornecedor) throws SQLException {

        String sql = """
                INSERT INTO Fornecedor (nome, cnpj)
                VALUES (?,?)
                """;
        try(Connection conn = Conexao.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getCnpj());
            ps.executeUpdate();
        }

    }

    public boolean existeCnpj (String cnpj) throws SQLException{
        boolean existe = false;

        String sql = """
                SELECT id, fornecedor, cnpj 
                FROM Fornecedor 
                WHERE cnpj = ?
                """;
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cnpj);
            var rs = ps.executeQuery();
            if (rs.next()){
                existe = true;
            }
        }
        return existe;
    }
}

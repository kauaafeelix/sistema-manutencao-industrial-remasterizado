import DAO.FornecedorDAO;
import Model.Fornecedor;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    static Scanner scNum = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        menu();
    }
    public static void menu() throws SQLException {
        int opcao;
        do {
            System.out.println("""
                    -------------- Seja Bem-Vindo --------------
                    Sistema de Gestão de Almoxarifado Industrial
                    
                    1 - Cadastrar Fornecedor
                    2 - Cadastrar Material
                    3 - Registrar Nota de Entrada
                    4 - Criar Requisição de Material
                    5 - Atender Requisição
                    6 - Cancelar Requisição
                    0 - Sair
                    
                    Digite sua Opção:
                    """);
            opcao = scNum.nextInt();
            scStr.nextLine();

            switch (opcao) {
                case 1 -> {
                    cadastrarFornecedor();
                }
                case 2 -> {
                    //cadastrarMaterial();
                }
                case 3 -> {
                    //registrarNotaEntrada();
                }
                case 4 -> {
                    //criarRequisicaoMaterial();
                }
                case 5 -> {
                    //atenderRequisicao();
                }
                case 6 -> {
                    //cancelarRequisicao();
                }
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                }
                default -> {
                    System.err.println("[ERRO] Opção inválida. Tente novamente.");
                }
            }
        } while (opcao != 0);
    }

    public static void cadastrarFornecedor() throws SQLException {
        var dao = new FornecedorDAO();
        System.out.println("\n----------- Cadastro de Fornecedor -----------");
        System.out.print("Nome do Fornecedor: ");
        String nome = scStr.nextLine();
        if (nome == null || nome.trim().isEmpty()) {
            System.err.println("[ERRO] Nome do fornecedor não pode ser vazio.");
            return;
        }
        System.out.print("CNPJ do Fornecedor: ");
        String cnpj = scStr.nextLine();
        if (cnpj == null || cnpj.trim().isEmpty()) {
            System.err.println("[ERRO] CNPJ do fornecedor não pode ser vazio.");
            return;
        }
        boolean existeCnpj = dao.existeCnpj(cnpj);
        if(!existeCnpj){
            var fornecedor = new Fornecedor(nome, cnpj);
            dao.cadastrarFornecedor(fornecedor);
            return;
        }
    }
}

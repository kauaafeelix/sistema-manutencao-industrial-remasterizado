import java.util.Scanner;

public class Main {

    static Scanner scNum = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);

    public static void main(String[] args) {



        menu();
    }
    public static void menu(){
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
        int opcao = scNum.nextInt();
        scStr.nextLine();
    }
}

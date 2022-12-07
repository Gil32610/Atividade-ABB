package Main;

import java.util.Scanner;

import ProductManagement.CadastroProdutos;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op, invent;
        double price;
        String code, descrip;
        CadastroProdutos cp = new CadastroProdutos();
        do {
            showMenu();
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 1:
                    cp.registerProduct();
                    break;
                case 2:
                    cp.exibirProdutos();
                    break;
                case 3:
                    System.out.println("Informe o código do produto:");
                    code = s.nextLine();
                    cp.alterarPreço(code);
                    break;
                case 4:
                    System.out.println("Informe o código do produto:");
                    code = s.nextLine();
                    cp.changeInventory(code);
                    break;
                case 5:
                    System.out.println("Informe o código do produto:");
                    code = s.nextLine();
                    cp.showProduct(code);
                    break;
                case 6:
                    System.out.println("Informe o código do produto:");
                    code = s.nextLine();
                    cp.removeProduct(code);
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (op != 0);
    }

    public static void showMenu() {
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Exibir lista de produtos");
        System.out.println("3 - Alterar preço de um produto");
        System.out.println("4 - Alterar o estoque de um produto");
        System.out.println("5 - Exibir informações de um produto");
        System.out.println("6 - Remover produto");
        System.out.println("0 - ENCERRAR");
    }
}

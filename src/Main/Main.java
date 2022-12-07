package Main;

public class Main {
    public static void main(String[] args) {
        int op, invent;
        double price;
        String code, descrip;
        do {
            showMenu();
            op = Integer.parseInt(s.nextLine());
            

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

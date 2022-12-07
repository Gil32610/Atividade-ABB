package ProductManagement;

import java.util.Scanner;
import BinaryTree.*;
import Produtos.*;

public class CadastroProdutos {
    private BinaryTree<Produto> Cadastro;

    public CadastroProdutos() {
        this.Cadastro = new BinaryTree<Produto>();
    }

    public void registerProduct() {
        Produto p;
        String code;
        String descrip;
        String fornecedor;
        double price;
        int invent;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a descrição do produto");
        descrip = s.nextLine();
        System.out.println("Informe o preço:");
        price = Double.parseDouble(s.nextLine());
        System.out.println("Informe o estoque:");
        invent = Integer.parseInt(s.nextLine());
        System.out.println("Informe o fornecedor:");
        fornecedor = s.nextLine();
        System.out.println("Informe o código:");
        code = s.nextLine();
        p = new Produto(code, fornecedor, descrip, price, invent);
        this.Cadastro.insert(p);
        System.out.println("Procedimento concluído");
    }

    public void exibirProdutos() {
        this.Cadastro.inOrder();
    }

    public Produto procurar(String codigo) {
        Produto produto = new Produto(codigo);
        Produto p;
        p = Cadastro.find(produto);
        return p;
    }

    public void alterarPreço(String code) {
        double preço;
        Scanner s = new Scanner(System.in);
        Produto product = procurar(code);
        if (product == null) {
            System.out.println("Produto não cadastro");
        } else {
            System.out.println("Informe o preço:");
            preço = Double.parseDouble(s.nextLine());
            product.setPrice(preço);
        }
    }

    public void changeInventory(String code) {
        int inventory;
        Scanner s = new Scanner(System.in);
        Produto product = procurar(code);
        if (product == null) {
            System.out.println("Produto não cadastro");
        } else {
            System.out.println("Informe o novo estoque:");
            inventory = Integer.parseInt(s.nextLine());
            product.setInvent(inventory);
            System.out.println("Operação concluída");
        }
    }

    public void showProduct(String code) {
        Produto product = procurar(code);
        if (product == null) {
            System.out.println("Produto não cadastro");
        } else {
            System.out.println(product);
            System.out.println("Operação concluída.");
        }
    }

    public void removeProduct(String code) {
        Produto product = procurar(code);
        Cadastro.remove(product);
        System.out.println("Operação concluída!");
    }
}

package Produtos;

public class Produto implements Comparable<Produto> {
    private String code;
    private String descrip;
    private double price;
    private int invent;

    public Produto(String code, String descrip, double price, int invent) {
        this.code = code;
        this.price = price;
        this.invent = invent;
        this.descrip = descrip;
    }

    public Produto(String code, String descrip) {
        this.descrip = descrip;
        this.code = code;
    }

    public Produto(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInvent(int invent) {
        this.invent += invent;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCode() {
        return this.code;
    }

    public double getPrice() {
        return this.price;
    }

    public int getInvent() {
        return this.invent;
    }

    public String getDescrip() {
        return this.descrip;
    }

    @Override
    public String toString() {
        return this.code + " " + this.descrip + " " + this.price + " " + this.invent;
    }

    @Override
    public int compareTo(Produto p) {
        int result;
        result = this.getCode().compareTo(p.getCode());
        return result;
    }

}
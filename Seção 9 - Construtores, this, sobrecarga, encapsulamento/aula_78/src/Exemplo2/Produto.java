package Exemplo2;

public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    //construtor padrao
    public Produto(){
    }

    //construtor1
    public Produto(String nome, int quantidade, double preco) {

        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    //construtor2
    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){

        this.preco = preco;
    }

    public int getQuantidade(){

        return quantidade;
    }

    public double valorTotalEstoque(){

        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){

        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade){

        this.quantidade -= quantidade;
    }

    public String toString(){

        return String.format("%s, R$%.2f, %d unidades, Total: R$%.2f", nome, preco, quantidade, valorTotalEstoque());
    }
}

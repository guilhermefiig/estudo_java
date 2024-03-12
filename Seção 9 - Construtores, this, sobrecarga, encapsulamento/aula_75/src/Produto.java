public class Produto {

    public String nome;
    public int quantidade;
    public double preco;

    public Produto(String nome, int quantidade, double preco) {

        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;

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
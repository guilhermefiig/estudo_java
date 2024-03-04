package entidades;

public class Produto {

        public String name;
        public int quantidade;
        public double preco;

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

            return String.format("%s, R$%.2f, %d unidades, Total: R$%.2f", name, preco, quantidade, valorTotalEstoque());

        }

}

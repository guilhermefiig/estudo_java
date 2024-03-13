import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o preço: ");
        double preco = entrada.nextDouble();

        //não digita quantidade em estoque

        Produto produto = new Produto(nome, preco);

        System.out.println("\nDados do produto: " + produto.toString());

        System.out.println("Digite uma quantidade de produtos para ser adicionado ao estoque: ");
        int quantidade = entrada.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println("\nDados atualizados: " + produto);

        System.out.println("Digite uma quantidade de produtos para ser removido ao estoque: ");
        quantidade = entrada.nextInt();
        produto.removerProduto(quantidade);

        System.out.println("\nDados atualizados: " + produto);


        entrada.close();
    }
}
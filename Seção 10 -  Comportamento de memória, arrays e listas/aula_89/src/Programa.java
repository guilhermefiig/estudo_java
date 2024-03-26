import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        Produto[] vetorProduto = new Produto[n];

        double soma = 0;

        for (int i = 0; i < vetorProduto.length; i++){

            input.nextLine();
            System.out.print("Digite um nome e um preço:");
            String nome = input.nextLine();
            double preco = input.nextDouble();

            vetorProduto[i] = new Produto(nome, preco);

            soma += vetorProduto[i].getPreco();
        }
        double media = soma / vetorProduto.length;

        System.out.println("Media: " + media);
        System.out.println(vetorProduto.length);

        input.close();
    }
}

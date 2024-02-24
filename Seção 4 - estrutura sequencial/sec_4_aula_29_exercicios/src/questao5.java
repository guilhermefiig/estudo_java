import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {

        int cod1, cod2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, valor1, valor2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código da peça 1: ");
        cod1 = sc.nextInt();

        System.out.print("Digite o valor de cada peça: ");
        valorPeca1 = sc.nextDouble();

        System.out.print("Digite quantas peças tem: ");
        numPeca1 = sc.nextInt();

        System.out.print("\n\n");

        System.out.print("Digite o código da peça 2: ");
        cod2 = sc.nextInt();

        System.out.print("Digite o valor de cada peça: ");
        valorPeca2 = sc.nextDouble();

        System.out.print("Digite quantas peças tem: ");
        numPeca2 = sc.nextInt();

        valor1 = valorPeca1 * numPeca1;
        valor2 = valorPeca2 * numPeca2;

        System.out.printf("Código do produto: %d\n" +
                            "Valor a ser pago pelas %d peças: %.2f \n\n",cod1, numPeca1, valor1);

        System.out.printf("Código do produto: %d\n" +
                "Valor a ser pago pelas %d peças: %.2f ",cod2, numPeca2, valor2);

        sc.close();
    }
}
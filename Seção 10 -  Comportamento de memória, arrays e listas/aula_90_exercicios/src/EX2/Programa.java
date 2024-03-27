package EX2;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ser o tamanho do vetor: ");
        int tamanho = input.nextInt();

        double[] vetor = new double[tamanho];

        double soma = 0;

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("Digite um número real para armazenar no índice[%d]", i);
            double numero = input.nextDouble();

            vetor[i] = numero;

            soma += numero;
        }

        System.out.print("Valores: ");
        for (int i = 0; i < vetor.length; i++){

            System.out.print(vetor[i] + "  ");
        }
        System.out.println("\nSoma: " + soma);
        System.out.println("Média: "+ soma/ vetor.length);

        input.close();
    }
}

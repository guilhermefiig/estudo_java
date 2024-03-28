package EX7;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para se o tamanho do vetor: ");
        int tamanho = input.nextInt();

        double[] vetor = new double[tamanho];

        double somaNumeros = 0;

        for (int i = 0; i < vetor.length; i++){

            System.out.print("Digite um número: ");
            double num = input.nextDouble();

            vetor[i] = num;

            somaNumeros += vetor[i];
        }

        double media = somaNumeros / vetor.length;
        System.out.println("Média: " + media);

        System.out.println("Números abaixo da média: ");
        for (int i = 0; i < vetor.length; i++){

            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        input.close();
    }
}

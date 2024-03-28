package EX6;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ser o tamanho dos vetores: ");
        int tamanho = input.nextInt();

        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetor3 = new int[tamanho];

        System.out.println("VETOR 1");
        for (int i = 0; i < vetor1.length; i++){

            System.out.printf("Digite um número para o índice[%d] do VETOR 1: ", i);
            int num = input.nextInt();

            vetor1[i] = num;
        }

        System.out.println("VETOR 2");
        for (int i = 0; i < vetor2.length; i++){

            System.out.printf("Digite um número para o índice[%d] do VETOR 2: ", i);
            int num = input.nextInt();

            vetor2[i] = num;
        }

        System.out.println("RESULTADO DA SOMA");
        for (int i = 0; i < vetor3.length; i++){

            vetor3[i] = vetor1[i] + vetor2[i];

            System.out.println("Soma dos vetores 1 e 2: " + vetor3[i]);
        }

        input.close();
    }
}

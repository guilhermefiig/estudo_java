package EX5;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ser o tamanho do vetor: ");
        int tamanho = input.nextInt();

        double[] vetor = new double[tamanho];

        double maiorNum = 0;

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("Digite um número para o índice [%d]: ", i);
            double num = input.nextDouble();

            vetor[i] = num;

            if (vetor[i] > maiorNum){
                maiorNum = vetor[i];
            }
        }

        System.out.println("Maior número digitado: " + maiorNum);

        for (int i = 0; i < vetor.length; i++){

            if (vetor[i] == maiorNum){
                System.out.println("Posição no vetor: " + i);
            }
        }

        input.close();
    }
}

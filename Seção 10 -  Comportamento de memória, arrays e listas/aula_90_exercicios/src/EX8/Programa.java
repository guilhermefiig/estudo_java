package EX8;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ser o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        int somaPares = 0, contPares = 0;

        for (int i = 0; i < vetor.length; i++){

            System.out.print("Digite um número: ");
            int num = input.nextInt();

            vetor[i] = num;
        }

        for (int i = 0; i < vetor.length; i++){

            if (vetor[i] % 2 == 0){

                somaPares += vetor[i];
                contPares++;
            }
        }

        if (somaPares != 0){

            double media = (double) somaPares / contPares ;

            System.out.printf("Média dos números pares: %.2f", media);

        }else {
            System.out.println("Nenhum número par");
        }

        input.close();
    }
}
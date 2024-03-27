package EX4;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ser o tamnho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        int contPares = 0;

        for (int i = 0; i < vetor.length; i++){

            System.out.printf("Digite um número para o vetor[%d]: ", i);
            int num = input.nextInt();

            vetor[i] = num;
        }

        System.out.println("Números pares: ");
        for (int i = 0; i < vetor.length; i++){

            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
                contPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contPares);

        input.close();
    }
}
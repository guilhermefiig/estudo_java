package EX1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para o tamanho: ");
        int tamanho = input.nextInt();

        if (tamanho <= 10){

            int[] vetor = new int[tamanho];

            for (int i = 0; i < vetor.length; i++){

                System.out.print("Digite um número: ");
                int num = input.nextInt();

                vetor[i] = num;

            }

            System.out.println("Números negativos: ");

            for (int i = 0; i < vetor.length; i++){

                if (vetor[i] < 0){
                    System.out.println(vetor[i]);
                }

            }

        }else {
            System.out.println("Digite um número menor ou igual a 10");
        }

        input.close();
    }
}

package EX9;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas que vai conter no vetor: ");
        int tamanho = input.nextInt();

        Pessoa[] vetorPessoas = new Pessoa[tamanho];

        int maiorIdade = 0;

        for (int i = 0; i < vetorPessoas.length; i++){

            input.nextLine();

            System.out.printf("Digite o nome da %d° pessoa: ", i+1);
            String nome = input.nextLine();

            System.out.printf("Digite a idade da %d° pessoa: ", i+1);
            int idade = input.nextInt();

            vetorPessoas[i] = new Pessoa(nome, idade);
        }

        for (int i = 0; i < vetorPessoas.length; i++){

            if (vetorPessoas[i].getIdade() > maiorIdade){

                maiorIdade = vetorPessoas[i].getIdade();
            }
        }

        for (int i = 0; i < vetorPessoas.length; i++){

            if (vetorPessoas[i].getIdade() == maiorIdade){

                System.out.printf("Pessoa com maior idade: %s", vetorPessoas[i].getNome());
            }
        }

        input.close();
    }
}
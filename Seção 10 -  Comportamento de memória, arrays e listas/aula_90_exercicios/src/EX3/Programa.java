package EX3;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidade = input.nextInt();

        Pessoa[] vetorPessoas = new Pessoa[quantidade];

        double somaAlturas = 0;
        int contIdades = 0;

        for (int i = 0; i < vetorPessoas.length; i++){

            System.out.printf("Dados da pessoa [%d]\n", i+1);

            input.nextLine();

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            System.out.print("Altura: ");
            double altura = input.nextDouble();

            vetorPessoas[i] = new Pessoa(nome, idade, altura);

            somaAlturas += vetorPessoas[i].getAltura();
        }

        System.out.println("Média das alturas: " + somaAlturas / vetorPessoas.length);
        for (int i = 0; i < vetorPessoas.length; i++){

            if (vetorPessoas[i].getIdade() < 16){
                contIdades++;
            }
        }

        double porcentagem = (double) contIdades / vetorPessoas.length * 100;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f\n", porcentagem);

        System.out.println("Pessoas com idade menor que 16 anos: ");
        for (int i = 0; i < vetorPessoas.length; i++){

            if (vetorPessoas[i].getIdade() < 16){
                System.out.println(vetorPessoas[i].getNome());
            }
        }

        input.close();
    }
}
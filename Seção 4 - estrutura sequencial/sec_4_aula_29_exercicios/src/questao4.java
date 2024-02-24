//Seção 4 / Aula 29

import java.util.Scanner;

public class questao4 {
    public static void main(String [] args){

        int numeroInscricao, numeroHorasTrabalho;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu número de inscrição: ");
        numeroInscricao = sc.nextInt();

        System.out.print("Digite sua quantidade de horas trabalhadas no mês: ");
        numeroHorasTrabalho = sc.nextInt();

        System.out.print("Digite qual o valor da sua hora de trabalho: ");
        valorHora = sc.nextDouble();

        salario = numeroHorasTrabalho * valorHora;

        System.out.printf("Número de inscrição: %d \n" +
                "Salário: R$ %.2f", numeroInscricao, salario);

        sc.close();
    }
}

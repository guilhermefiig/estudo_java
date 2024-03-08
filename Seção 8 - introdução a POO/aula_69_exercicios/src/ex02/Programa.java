package ex02;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        
        System.out.print("Nome: ");
        funcionario.nome = entrada.nextLine();

        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = entrada.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = entrada.nextDouble();

        System.out.printf("%s, %.2f \n", funcionario.nome, funcionario.salarioLiquido());

        System.out.print("Quantos % seu salario aumentou? ");
        funcionario.porcentagem = entrada.nextDouble();


        System.out.printf("%s, %.2f", funcionario.nome, funcionario.aumentarSalario());

        entrada.close();
    }
}
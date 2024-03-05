package ex02;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        String nome;
        double salarioBruto, porcentagem, imposto;

        System.out.print("Nome: ");
        nome = entrada.nextLine();

        System.out.print("Salário bruto: ");
        salarioBruto = entrada.nextDouble();

        System.out.print("Imposto: ");
        imposto = entrada.nextDouble();

        System.out.printf("%s, %.2f \n", nome, funcionario.salarioLiquido(salarioBruto, imposto));

        System.out.print("Quantos % seu salario aumentou? ");
        porcentagem = entrada.nextDouble();


        double novoSalario = funcionario.aumentarSalario(salarioBruto, porcentagem, imposto);
        System.out.printf("%s, %.2f", nome, novoSalario);

        entrada.close();
    }
}

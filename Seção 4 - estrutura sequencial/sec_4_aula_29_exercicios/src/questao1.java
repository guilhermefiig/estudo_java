//Seção 4 / Aula 29

import java.util.Scanner;

public class questao1 {
    public static void main(String [] args){

        int num1, num2, conta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();

        conta = num1 + num2;

        System.out.printf("A soma de %d + %d = %d \n",num1, num2, conta);

        sc.close();
    }
}

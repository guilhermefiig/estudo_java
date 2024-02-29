//Seção 4 / Aula 29

import java.util.Scanner;

public class questao3 {
    public static void main(String [] args){

        int a, b, c, d, diferenca;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para A: ");
        a = sc.nextInt();

        System.out.print("Digite um número para B: ");
        b = sc.nextInt();

        System.out.print("Digite um número para C: ");
        c = sc.nextInt();

        System.out.print("Digite um número para D: ");
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.printf("A diferença entre o produto de %d e %d pelo produto de %d e %d = %d",
                            a, b, c, d, diferenca);

        sc.close();
    }
}

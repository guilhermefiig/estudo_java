package ex01;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Medida medida = new Medida();

        double largura, altura;

        System.out.println("Digite a largura e altura do retângulo");
        largura = entrada.nextDouble();
        altura = entrada.nextDouble();

        System.out.println(Medida.calcularArea(largura, altura));
        System.out.println(Medida.calcularPerimetro(largura, altura));
        System.out.println(Medida.calcularDiagonal(largura, altura));

        entrada.close();
    }
}

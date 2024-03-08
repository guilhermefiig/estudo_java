package ex01;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Medida medida = new Medida();

        System.out.println("Digite a largura e altura do retângulo");
        medida.largura = entrada.nextDouble();
        medida.altura = entrada.nextDouble();

        System.out.println(medida.calcularArea());
        System.out.println(medida.calcularPerimetro());
        System.out.println(medida.calcularDiagonal());

        entrada.close();
    }
}
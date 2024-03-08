package SegundaVersao;

import java.util.Scanner;

public class SegundaVersao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Calculador calculador = new Calculador();

        System.out.print("Digite um raio: ");
        double raio = entrada.nextDouble();

        double c = calculador.circunferencia(raio);
        double v = calculador.volume(raio);

        System.out.printf("Circunferência: %.2f \n", c);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("Valor de PI: %.2f \n", calculador.PI);

        entrada.close();
    }
}
package aplicacao;

import entidades.Triangulo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Triangulo y, x;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triangulo X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("Digite as medidas do triangulo Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triangulo X: %.4f \n", areaX);
        System.out.printf("Área do triangulo Y: %.4f \n", areaY);

        if (areaX > areaY){

            System.out.println("Maior área: X");

        }else {

            System.out.println("Maiior área: Y");

        }

        entrada.close();
    }
}

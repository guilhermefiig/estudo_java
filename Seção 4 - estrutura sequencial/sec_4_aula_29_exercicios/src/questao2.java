//Seção 4 / Aula 29

import java.util.Scanner;

public class questao2 {
    public static void main(String [] args){

        double raio, area;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para ser o raio do circulo: ");
        raio = sc.nextDouble();

        area =  Math.pow(raio, 2) * pi;

        System.out.printf("A área do circulo com raio %.2f é = %.4f \n", raio, area);

        sc.close();
    }
}

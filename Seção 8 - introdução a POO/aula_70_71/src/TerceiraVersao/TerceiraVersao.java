package TerceiraVersao;

import java.util.Scanner;

public class TerceiraVersao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um raio: ");
        double raio = entrada.nextDouble();

        double c = Calculador.circunferencia(raio);
        double v = Calculador.volume(raio);

        System.out.printf("Circunferência: %.2f \n", c);
        System.out.printf("Volume: %.2f \n", v);
        System.out.printf("Valor de PI: %.2f \n", Calculador.PI);

        entrada.close();
    }
}
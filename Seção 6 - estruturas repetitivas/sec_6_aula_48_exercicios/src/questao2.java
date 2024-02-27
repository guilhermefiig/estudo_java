import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){

        double x, y;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        x = entrada.nextDouble();

        System.out.print("Digite um valor para Y: ");
        y = entrada.nextDouble();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0){

                System.out.println("1º quadrante");

            } else if (x < 0 && y > 0) {

                System.out.println("2º quadrante");

            } else if (x < 0 && y < 0) {

                System.out.println("3º quadrante");

            } else if (x > 0 && y < 0) {

                System.out.println("4º quadrante");

            }

            System.out.print("Digite um valor para X: ");
            x = entrada.nextDouble();

            System.out.print("Digite um valor para Y: ");
            y = entrada.nextDouble();
        }

        entrada.close();
    }
}

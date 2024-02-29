import java.util.Scanner;

public class questao7 {
    public static void main(String[] args){

        double x, y;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        x = entrada.nextDouble();

        System.out.print("Digite um valor para Y: ");
        y = entrada.nextDouble();

        if (x > 0 && y > 0){

            System.out.print("1º quadrante");

        } else if (x < 0 && y > 0) {

            System.out.print("2º quadrante");

        } else if (x < 0 && y < 0) {

            System.out.print("3º quadrante");

        } else if (x > 0 && y < 0) {

            System.out.print("4º quadrante");

        } else if (x == 0 && y != 0) {

            System.out.print("Eixo Y");

        } else if (x != 0 && y == 0) {

            System.out.print("Eixo X");
            
        } else {

            System.out.print("Origem!");

        }

        entrada.close();
    }
}

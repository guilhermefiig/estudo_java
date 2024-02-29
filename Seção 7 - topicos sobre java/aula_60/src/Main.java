import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int a, b ,c, maior;

        System.out.println("Digite 3 números");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        maior = max(a, b, c);

        mostreResultado(maior);

        entrada.close();
    }

    public static int max(int x, int y, int z){

        int saida;

        if (x > y && x > z) {

            saida = x;

        } else if (y > z) {

            saida = y;

        } else {

            saida = z;

        }

        return saida;
    }

    public static void mostreResultado(int valor){

        System.out.println("Maior: " + valor);

    }
}
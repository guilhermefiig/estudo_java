import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n, i;
        double num1, num2, num3, media;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        for (i = 0; i < n; i++){

            System.out.print("Digite o valor 1: ");
            num1 = entrada.nextDouble();

            System.out.print("Digite o valor 2: ");
            num2 = entrada.nextDouble();

            System.out.print("Digite o valor 3: ");
            num3 = entrada.nextDouble();

            media = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;

            System.out.printf("A média é: %.1f \n", media);
        }

        entrada.close();
    }
}

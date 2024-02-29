import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n, i, num1, num2;
        double conta;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        for (i = 0; i < n; i++) {

            System.out.print("Digite o primeiro número: ");
            num1 = entrada.nextInt();

            System.out.print("Digite o segundo número: ");
            num2 = entrada.nextInt();

            conta = (double) num1 / num2;

            if (num2 == 0) {

                System.out.println("Divisão impossivel.");

            }else {

                System.out.printf("%d dividido por %d é %.1f \n", num1, num2, conta);

            }
        }

        entrada.close();
    }
}

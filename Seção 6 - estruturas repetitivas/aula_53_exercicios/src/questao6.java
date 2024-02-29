import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n, i;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        for (i = 1; i <= n; i++){

            int conta = n % i;

            if (conta == 0){

                System.out.println(i);

            }
        }

        entrada.close();
    }
}

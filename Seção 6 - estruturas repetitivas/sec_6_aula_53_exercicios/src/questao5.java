import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n, i, fatorial = 1;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        for (i = 1 ; i <= n; i++){

            fatorial = fatorial * i;

        }

        System.out.println(fatorial);

        entrada.close();
    }
}

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){

        int a, b, conta1, conta2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        a = entrada.nextInt();

        System.out.print("Digite outro número: ");
        b = entrada.nextInt();

        conta1 = a % b;
        conta2 = b % a;

        if (conta1 == 0 || conta2 == 0){
            System.out.printf("%d e %d são multiplos", a, b);
        }else {
            System.out.printf("%d e %d não são multiplos", a, b);
        }

        entrada.close();
    }
}

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){

        int num, resto;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        resto = num % 2;

        if (resto == 0){
            System.out.printf("O número %d é par", num);
        }else {
            System.out.printf("O número %d é impar", num);
        }

        entrada.close();
    }
}

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args){

        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num > 0){
            System.out.printf("O número %d é positivo.", num);
        } else if (num < 0) {
            System.out.printf("O número %d é negativo.", num);
        } else {
            System.out.print("O número digitado é 0");
        }

        entrada.close();
    }
}

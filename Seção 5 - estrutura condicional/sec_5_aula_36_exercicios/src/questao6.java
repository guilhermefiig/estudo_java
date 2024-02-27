import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){

        int num;

        Scanner entrada =  new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num >= 0 && num <= 25){

            System.out.printf("O número %d está entre 0 e 25.", num);
            
        } else if (num >= 26 && num <= 50) {

            System.out.printf("O número %d está entre 26 e 50.", num);
            
        } else if (num >= 51 && num <= 75) {

            System.out.printf("O número %d está entre 51 e 75.", num);

        } else if (num >= 76 && num <= 100) {

            System.out.printf("O número %d está entre 76 e 100.", num);

        }else {

            System.out.println("Fora do intervalo!");

        }
        entrada.close();
    }
}

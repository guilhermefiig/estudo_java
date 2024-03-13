import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite quanto você quer depositar: ");
        double depositoInicial =  input.nextDouble();

        int numeroConta = random.nextInt(1000);

        Banco banco = new Banco(numeroConta, nome, depositoInicial);

        banco.setSaldo(depositoInicial);

        

        System.out.println(banco.toString());

    }
}

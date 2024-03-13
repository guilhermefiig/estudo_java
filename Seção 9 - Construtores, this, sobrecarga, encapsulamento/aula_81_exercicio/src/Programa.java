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

        System.out.print("Digite um valor que queira depositar em sua conta: ");
        double valorDeposito = input.nextDouble();
        banco.depositar(valorDeposito);

        System.out.println(banco.toString());

        System.out.println("Digite um valor que queira sacar (+ R$5 taxa): ");
        double valorSaque = input.nextDouble();
        banco.sacar(valorSaque);

        System.out.println(banco.toString());

    }
}

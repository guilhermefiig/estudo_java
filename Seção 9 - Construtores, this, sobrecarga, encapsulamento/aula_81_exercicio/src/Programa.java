import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Banco banco = null;

        double depositoInicial = 0;

        int numeroConta = random.nextInt(1000);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Você quer fazer um depósito inicial? [s/n]");
        char resposta = input.nextLine().charAt(0);

        if (resposta == 's') {
            System.out.print("Digite um valor para o depósito inicial: ");
            depositoInicial = input.nextDouble();

            banco = new Banco(numeroConta, nome, depositoInicial);

        } else if (resposta == 'n') {
            System.out.println();

            banco = new Banco(numeroConta, nome);

        }else{
                System.out.printf("ERRO! %c não é reconhecido",resposta);
                System.exit(0);
        }


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

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args){

        int senha = 2002;
        int tentativa;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        tentativa = entrada.nextInt();

        while (tentativa != senha){

            System.out.println("Senha inválida. Tente novamente");

            System.out.print("Digite uma senha: ");
            tentativa = entrada.nextInt();

        }

        System.out.println("Acesso permitido!");

        entrada.close();
    }
}

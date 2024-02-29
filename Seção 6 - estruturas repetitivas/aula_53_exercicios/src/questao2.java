import java.util.Scanner;

public class questao2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n, x, i, dentro = 0, fora = 0;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        for (i = 0; i < n; i++){

            System.out.print("Digite outro número: ");
            x = entrada.nextInt();

            if (x >= 10 && x <= 20){
                dentro++;
            }else {
                fora++;
            }
        }
        System.out.printf("Dentro: %d\n" +
                        "Fora: %d", dentro, fora);

        
        entrada.close();
    }
}

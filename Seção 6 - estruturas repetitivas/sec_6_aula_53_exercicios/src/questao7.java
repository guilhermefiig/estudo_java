import java.util.Scanner;

public class questao7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = entrada.nextInt();

        if (n > 0){

            for (int i = i = 1; i <= n; i++){

                int nQuadrado, nCubo;

                nQuadrado = i * i;
                nCubo = i * i * i;

                System.out.printf("%d %d %d \n", i, nQuadrado, nCubo);

            }
        }else{

            System.out.println("Número digitado tem que ser maior que 0!");

        }

        entrada.close();
    }
}

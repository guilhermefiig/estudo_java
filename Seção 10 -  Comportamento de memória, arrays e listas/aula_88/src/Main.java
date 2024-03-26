import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();

        double[] alturas = new double[n];

        double soma = 0;

        for(int i = 0; i<n; i++){

            System.out.print("Digite uma altura: ");
            double altura = input.nextDouble();

            alturas[i] = altura;

            soma += alturas[i];
        }
        double media = soma / n;

        System.out.println("Media: " + media);

        input.close();
    }
}
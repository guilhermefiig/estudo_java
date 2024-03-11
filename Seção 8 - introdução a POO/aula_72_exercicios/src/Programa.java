import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do dólar: ");
        double dolar = scanner.nextDouble();

        System.out.print("Digite quantos dolates você vai comprar: ");
        double real = scanner.nextDouble();

        System.out.printf("Você vai gastar %.2f reais", Conversor.ConversorMoedas(dolar, real));

        scanner.close();
    }
}

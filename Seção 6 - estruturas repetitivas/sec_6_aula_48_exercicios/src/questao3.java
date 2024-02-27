import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int alcool = 0,
                gasolina = 0, diesel = 0, codigo;

        System.out.print("Digite 1 para álcool, 2 para gasolina, 3 para diesel ou 4 para parar: ");
        codigo = entrada.nextInt();

        while (codigo != 4){

            switch (codigo){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }

            System.out.print("Digite 1 para álcool, 2 para gasolina, 3 para diesel ou 4 para parar: ");
            codigo = entrada.nextInt();

        }

        System.out.printf("Muito obrigado!\n" +
                        "Álcool: %d\n" +
                        "Gasolina: %d\n" +
                        "Diesel: %d", alcool, gasolina, diesel);

        entrada.close();
    }
}

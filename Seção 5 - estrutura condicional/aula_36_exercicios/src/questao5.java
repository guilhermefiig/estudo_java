import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){

        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;
        double conta;
        int codigo, quantidade;


        Scanner entrada = new Scanner(System.in);

        System.out.printf("Código 1: Cachorro quente %.2f; \n" +
                            "Código 2: X-Salada %.2f; \n" +
                            "Código 3: X-Bacon %.2f; \n" +
                            "Código 4: Torrada simples %.2f; \n" +
                            "Código 5: Refrigerante %.2f \n" +
                            "Digite um código do produto que você quer: ",
                            cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante);
        codigo = entrada.nextInt();

        System.out.print("Digite quantas unidades você quer: ");
        quantidade = entrada.nextInt();

        if (quantidade > 0) {

             if (codigo == 1){

                conta = quantidade * cachorroQuente;

                 System.out.printf("%d fica R$%.2f", quantidade, conta);

             } else if (codigo == 2) {

                 conta = quantidade * xSalada;

                 System.out.printf("%d fica R$%.2f", quantidade, conta);

             } else if (codigo == 3) {

                 conta = quantidade * xBacon;

                 System.out.printf("%d fica R$%.2f", quantidade, conta);

             } else if (codigo == 4) {

                 conta = quantidade * torradaSimples;

                 System.out.printf("%d fica R$%.2f", quantidade, conta);

             } else if (codigo == 5) {

                 conta = quantidade * refrigerante;

                 System.out.printf("%d fica R$%.2f", quantidade, conta);

             } else {
                System.out.println("Digite um código válido!");
             }
        }else {
            System.out.println("Digite uma quantidade maior que 0!");
        }

        entrada.close();
    }
}

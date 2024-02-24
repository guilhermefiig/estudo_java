import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){

        int horaInicial, horaFinal, tempoDuracao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        horaInicial = entrada.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        horaFinal = entrada.nextInt();

        if (horaInicial > 23 || horaInicial < 0 || horaFinal > 23 || horaFinal < 0) {

            System.out.println("Digite um horário valido, entre 00 e 23");

        }else if (horaInicial < horaFinal) {

            tempoDuracao = horaFinal - horaInicial;

            System.out.printf("O jogo durou %d horas", tempoDuracao);

        } else if (horaInicial > horaFinal) {

            tempoDuracao = (horaFinal + 24) - horaInicial;

            System.out.printf("O jogo durou %d hora(s)", tempoDuracao);

        } else if (horaInicial == horaFinal) {

            System.out.println("O jogo durou 24 horas");

        }

        entrada.close();
    }
}

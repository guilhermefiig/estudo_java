package ex03;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);

        Notas notas = new Notas();

        System.out.print("Digite uma nota dos 3 trimestres: ");
        notas.trimestre1 = entrada.nextDouble();
        notas.trimestre2 = entrada.nextDouble();
        notas.trimestre3 = entrada.nextDouble();

        System.out.println(notas.notaFinal());
        System.out.println(notas.resultado());

        entrada.close();
    }
}

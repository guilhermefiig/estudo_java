package ex03;

public class Notas {

    public double trimestre1;
    public double trimestre2;
    public double trimestre3;

    public double notaFinal(){

        return this.trimestre1 + this.trimestre2 + this.trimestre3;

    }

    public String resultado(){

        double falta = 60 - notaFinal();

        if (notaFinal() >= 60) {

            return "Passou!";
        }else {

            return String.format("Reprovado!\n" +
                                "Faltou: %.2f pontos", falta);
        }
    }
}

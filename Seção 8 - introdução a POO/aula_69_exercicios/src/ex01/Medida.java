package ex01;

public class Medida {

    public double largura;
    public double altura;

    public static double calcularArea(double largura, double altura){

        return largura * altura;

    }

    public static double calcularPerimetro(double largura, double altura){

        return 2 * (largura + altura);

    }

    public static double calcularDiagonal(double largura, double altura){

        double valores = Math.pow(largura, 2) + Math.pow(altura, 2);

        return Math.sqrt(valores);

    }

}

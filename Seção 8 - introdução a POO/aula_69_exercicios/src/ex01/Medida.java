package ex01;

public class Medida {

    public double largura;
    public double altura;

    public double calcularArea(){

        return this.largura * this.altura;
    }

    public double calcularPerimetro(){

        return 2 * (this.largura + this.altura);
    }

    public double calcularDiagonal(){

        double valores = Math.pow(this.largura, 2) + Math.pow(this.altura, 2);

        return Math.sqrt(valores);
    }
}
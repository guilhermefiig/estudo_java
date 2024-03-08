package ex02;

public class Funcionario {

    public String nome;
    public double salarioBruto, imposto, porcentagem;

    public double salarioLiquido(){

        return this.salarioBruto - this.imposto;

    }

    public double aumentarSalario(){

        double aumento = this.salarioBruto * this.porcentagem / 100;
        this.salarioBruto += aumento;
        return this.salarioLiquido();

    }
}

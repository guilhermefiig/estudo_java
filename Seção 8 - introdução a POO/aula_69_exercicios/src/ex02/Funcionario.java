package ex02;

public class Funcionario {

    public String nome;
    public double salarioBruto, imposto;

    public double salarioLiquido(double salarioBruto, double imposto){

        return salarioBruto - imposto;

    }

    public double aumentarSalario(double salarioBruto, double porcentagem, double imposto){

        double aumento = salarioBruto * porcentagem / 100;
        double novoSalario = salarioBruto + aumento;
        return novoSalario - imposto;

    }
}

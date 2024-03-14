public class Banco {
    private int numeroConta;
    private String nomeTitutlar;
    private double saldo;

    public Banco(int numeroConta, String nomeTitutlar, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitutlar = nomeTitutlar;
        depositar(depositoInicial);
    }

    public Banco(int numeroConta, String nomeTitutlar){

        this.numeroConta = numeroConta;
        this.nomeTitutlar = nomeTitutlar;
    }

    public int getNumeroConta(){

        return numeroConta;
    }

    public String getNomeTitutlar(){

        return nomeTitutlar;
    }

    public void setNomeTitutlar(String nomeTitutlar){

        this.nomeTitutlar = nomeTitutlar;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double depositoInicial){

        saldo = depositoInicial;
    }

    public void depositar(double valorDeposito){

        //saldo = depositoInicial;

        saldo += valorDeposito;
    }

    public void sacar(double valorSaque){

        int taxa = 5;

        saldo -= valorSaque + taxa;
    }

    public String toString(){

        return String.format("""
                
                Número da conta: %d\s
                Nome do titular: %s
                Saldo: %.2f

                """, numeroConta, nomeTitutlar, saldo);
    }
}

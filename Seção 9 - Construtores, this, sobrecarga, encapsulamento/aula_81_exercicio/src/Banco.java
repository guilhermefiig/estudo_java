public class Banco {
    private int numeroConta;
    private String nomeTitutlar;
    private double depositoInicial;
    private double saldo;

    public Banco(){
    }

    public Banco(int numeroConta, String nomeTitutlar, double depositoInicial){

        this.numeroConta = numeroConta;
        this.nomeTitutlar = nomeTitutlar;
        this.depositoInicial = depositoInicial;
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

    public double getDepositoInicial(){

        return depositoInicial;
    }

    public void setSaldo(double depositoInicial){

        saldo = depositoInicial;
    }

    public double depositar(double valorDeposito){

        //saldo = depositoInicial;

        return saldo += valorDeposito;
    }

    public double sacar(double valorSaque){

        int taxa = 5;

        return saldo -= valorSaque + taxa;
    }

    public String toString(){

        return String.format("""
                
                Número da conta: %d\s
                Nome do titular: %s
                Saldo: %.2f

                """, numeroConta, nomeTitutlar, saldo);
    }
}

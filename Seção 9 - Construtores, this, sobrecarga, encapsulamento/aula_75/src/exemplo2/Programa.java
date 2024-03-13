package exemplo2;

public class Programa {
    public static void main(String[] args){

        Carro carro1 = new Carro("Mercedes");
        carro1.nome = "SLK200";
        carro1.ano = 2009;

        Carro carro2 = new Carro("Porsche");
        carro2.nome = "Taycan";
        carro2.ano = 2024;

        System.out.println(carro1.marca);
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);

        System.out.println(carro2.marca);
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);

    }
}

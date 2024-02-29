public class Main {
    public static void main(String[] args) {

        int idade1 = 18;
        double idade2 = idade1;
        //transformando o valor q contém em idade1 (18) em double (18.0)

        idade1 = (int) idade2;
        //para transformar de double pra int tem q informar que abro mão do valor após o ponto

        char letra = 'a';
        String nome = String.valueOf(letra);

    }
}
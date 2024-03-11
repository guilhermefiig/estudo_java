public class Conversor {

    public static double ConversorMoedas(double dolar, double real){

        double iof = (real * dolar) * 6/100;
        return (dolar * real) + iof;

    }
}

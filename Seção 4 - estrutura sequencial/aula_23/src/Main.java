public class Main {
    public static void main(String[] args){

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double masure = 53.234567;

        System.out.printf("Products:\n" +
                        "%s, witch price is %.2f\n" +
                        "%s, witch price is %.2f\n\n" +
                        "Record: %d years old, code %d, and gender: %c\n" +
                        "Meause witch eight decimal places: %.8f\n" +
                        "Rouded (three dacimal places): %.3f\n" +
                        "US decimal point: %.3f", product1, price1, product2, price2, age, code, gender,
                masure, masure, masure);
    }
}

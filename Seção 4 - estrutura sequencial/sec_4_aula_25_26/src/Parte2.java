import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.printf("%s\n%s\n%s", s1, s2, s3);

        sc.close();
    }
}

import java.util.Locale;

public class Main {
    public static void main(String[] args){

        String original = "abcde ABCDE   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xyz");
        int s08 = original.indexOf("cd");
        int s09 = original.lastIndexOf("cd");

    }
}

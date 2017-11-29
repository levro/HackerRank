import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.println(isPangram(S));
    }

    static String isPangram(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        for (char symbol : alphabet.toCharArray()) {
            if (s.indexOf(symbol) == -1) return "not pangram";
        }
        return "pangram";
    }
}

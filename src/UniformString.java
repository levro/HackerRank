import java.util.Scanner;

public class UniformString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();

            System.out.println(isU(s, x));

        }
    }
    static String isU(String str, int x){
        String alphabet = "@abcdefghijklmnopqrstuvwxyz";
        int weight = 0;
        char previous = ' ';
        char current = '@';
        for (int i = 0; i < str.length(); i++) {
            weight += alphabet.indexOf(current);
            current = str.charAt(i);
            if (weight == x) return "YES";
            if (current != previous){
                previous = str.charAt(i);
                weight = 0;
            }
        }
        return "NO";
    }
}
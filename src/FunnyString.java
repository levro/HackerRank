import java.util.*;

public class FunnyString {

    static String funnyString(String s){
        int n = s.length();
        for (int i = 0; i < (n - 1) / 2; i++) {
            int a = s.charAt(i + 1) - s.charAt(i);
            int b = s.charAt(n - 1 - i) - s.charAt(n - 2 - i);
            if (Math.abs(a) != Math.abs(b)) return "Not Funny";
        }
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
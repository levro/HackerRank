import java.util.*;

public class SeparateNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            long res = checkString(s);
            System.out.println(res == -1 ? "NO" : "YES " + res);
        }
    }

    private static long checkString( String s ) {
        if (s.length() < 2) return -1;
        for ( int j = 1; j <= s.length() / 2; j++ ) {
            long first = Long.parseLong( s.substring( 0, j ) );
            String test = "" + first;
            for ( long i = first + 1; test.length() < s.length(); i++ ) {
                test += i;
            }
            if (test.equals( s )) return first;
        }
        return -1;
    }
}
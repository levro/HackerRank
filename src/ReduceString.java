import java.util.*;

public class ReduceString {

    static String super_reduced_string(String s){
        int length;
//        if (length == 1) return s;
        do {
            length = s.length();
//            if (length == 1) return s;
            for ( int i = 1; i < s.length(); i++ ) {
                if (s.charAt( i ) == s.charAt( i - 1 )){
                    s = s.substring( 0, i - 1 ) + s.substring( i + 1 );
                }
            }
        } while ( length != s.length() );
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
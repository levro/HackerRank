import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2){
        System.out.println("s1 - " + s1.length() + ". s2 - " + s2.length());
        String tmp;
        if (s2.length() > s1.length()){
            tmp = s2;
            s2 = s1;
            s1 = tmp;
        }
        for ( int i = 0; i < s1.length(); i++ ) {
            if (s2.indexOf( s1.charAt( i )) >= 0) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            long st = System.currentTimeMillis();
            String result = twoStrings(s1, s2);
            System.out.println("программа выполнялась " + (System.currentTimeMillis() - st) + " миллисекунд");
            System.out.println("# " + (a0+1) + ". res = " + result);
        }
    }
}
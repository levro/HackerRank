import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Hackerrank {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(isHackerrank(s));
        }
    }
    static String isHackerrank(String str){
        String hackerrank = "hackerrank";
        int index = 0;
        for (char symbol : hackerrank.toCharArray()){
            if (str.indexOf(symbol, index) == -1) return "NO";
            index = str.indexOf(symbol, index) + 1;
        }
        return "YES";
    }
}
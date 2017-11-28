import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        int symbol;
        for (int i = 0; i < s.length(); i++) {
            symbol = (int)s.charAt(i);
            if ( 65 <= symbol && symbol <= 90) count++;
        }
        System.out.println(count);
    }
}
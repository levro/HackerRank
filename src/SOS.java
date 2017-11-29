import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class SOS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int damaged = 0;
        for (int i = 0; i < S.length(); i += 3) {
            if (S.charAt(i) != 'S') damaged++;
            if (S.charAt(i + 1) != 'O') damaged++;
            if (S.charAt(i + 2) != 'S') damaged++;
        }
        System.out.println(damaged);
    }
}
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Programmer {

    static String solve(int year){
        int day = 13;
        if (year < 1918){
            if (year % 4 == 0) day--;
        }
        else if (year > 1918){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) day--;
        }
        else day = 26;
        return "" + day + ".09." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
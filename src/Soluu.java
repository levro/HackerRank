import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Soluu {

    static String timeConversion(String s) {
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ssa");
        Date parsingDate = new Date();
        try {
        parsingDate = ft.parse(s);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        SimpleDateFormat ft1 = new SimpleDateFormat("HH:mm:ss");
        return ft1.format(parsingDate);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

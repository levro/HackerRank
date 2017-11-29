import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class LongFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        BigInteger next;

        for ( int i = 1; i <= num; i++ ) {
            next = BigInteger.valueOf( i );
            factorial = factorial.multiply( next );
        }
        System.out.println(factorial.toString());
    }
}
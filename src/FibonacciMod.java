import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciMod {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int n = in.nextInt();
        BigInteger fibi, fibi1, fibi2;

        fibi = BigInteger.valueOf( 1 );
        fibi1 = BigInteger.valueOf( t1 );
        fibi2 = BigInteger.valueOf( t2 );

        System.out.println(fib(fibi1, fibi2, n));

        for ( int i = 2; i < n; i++ ) {
            fibi = fibi1.add( fibi2.multiply( fibi2 ) );
            fibi1 = fibi2;
            fibi2 = fibi;
        }
        System.out.println(fibi.toString());
    }

    private static BigInteger fib( BigInteger fibi1, BigInteger fibi2, int n ) {
        if (n == 1) return fibi1;
        else if (n == 2) return fibi2;
        else {
            return fib(fibi2, fibi1.add(fibi2.multiply( fibi2 )), n - 1);
        }
    }

}

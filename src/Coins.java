import java.util.*;

public class Coins {

    static long getWays(long n, long[] c){
        for ( int i = 0; i < c.length - 1; i++ ) {
            for ( int j = i + 1; j < c.length; j++ ) {

            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }

        System.out.println(Arrays.toString(c));

        long ways = getWays(n, c);
    }
}
import java.util.*;

public class GamingArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] A = new int[n];
            for ( int i = 0; i < n; i++ ) {
                A[i] = in.nextInt();
            }

            int bob = 0;
            int end = n - 1;

            do {
                bob ^= 1;
                end = maxId(A, end);
            }while ( end > 0 );

            System.out.println(bob == 1 ? "BOB" : "ANDY");
        }
    }

    private static int maxId( int[] a, int end ) {
        int maxi = 0;
        int index = 0;
        for ( int i = 0; i < end; i++ ) {
            if (maxi < a[i]){
                maxi = a[i];
                index = i;
            }
        }
        return index;
    }
}
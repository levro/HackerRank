import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }

        Arrays.sort( ar );

        int minDist = ar[1] - ar[0];
        for ( int i = 1; i < s; i++ ) {
            if (ar[i] - ar[i-1] < minDist) minDist = ar[i] - ar[i-1];
        }
        for ( int i = 1; i < s; i++ ) {
            if ( ar[i] - ar[i - 1] == minDist ) {
                System.out.print(ar[i-1] + " " + ar[i] + " ");
            }
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }

        Arrays.sort( ar );

        System.out.println(ar[s/2]);

    }
}

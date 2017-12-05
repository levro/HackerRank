import java.util.Scanner;

public class CountingSort2 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }

        int[] arr = new int[s];
        for ( int i = 0; i < 100; i++ ) {
            int count = 0;
            for ( int j = 0; j < s; j++ ) {
                if ( ar[j] == i ) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
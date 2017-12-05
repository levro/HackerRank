import java.util.Scanner;

public class CountingSort1 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }

        for ( int i = 0; i < 100; i++ ) {
            int count = 0;
            for ( int j = 0; j < s; j++ ) {
                if (ar[j] == i) count++;
            }
            System.out.print(count + " ");
        }
    }
}

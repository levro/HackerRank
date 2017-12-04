import java.util.*;

public class QuickSort1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);
    }

    private static void quickSort( int[] ar ) {
        int pivot = ar[0];
        for ( int i = 0; i < ar.length; i++ ) {
            if ( ar[i] < pivot ) {
                System.out.print(ar[i] + " ");
            }
        }
        for ( int i = 0; i < ar.length; i++ ) {
            if ( ar[i] == pivot ) {
                System.out.print(ar[i] + " ");
            }
        }
        for ( int i = 0; i < ar.length; i++ ) {
            if ( ar[i] > pivot ) {
                System.out.print(ar[i] + " ");
            }
        }
    }
}
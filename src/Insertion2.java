import java.util.*;

public class Insertion2 {

    public static void insertionSortPart2(int[] ar)
    {
        int len = ar.length;

        for (int len_sorted = 2; len_sorted <= len; len_sorted++) {

            int inserting = ar[len_sorted - 1];
            for (int j = 1 ; j <= len_sorted; j++) {
                if (j != len_sorted && inserting < ar[len_sorted - j - 1]){
                    ar[len_sorted - j] = ar[len_sorted - j - 1];
                }
                else{
                    ar[len_sorted - j] = inserting;
                    j = len_sorted;
                }
            }
            printArray(ar);
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
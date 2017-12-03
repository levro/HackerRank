import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Insertion1 {



    public static void insertIntoSorted(int[] ar) {
        int len = ar.length;
        int inserting = ar[len - 1];
        for (int i = 1; i <= len; i++) {
            if (i != len && inserting < ar[len - i - 1]){
                ar[len - i] = ar[len - i - 1];
                printArray(ar);
            }
            else{
                ar[len - i] = inserting;
                printArray(ar);
                return;
            }
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
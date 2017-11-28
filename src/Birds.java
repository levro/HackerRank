import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Birds {

    static int migratoryBirds(int n, int[] ar) {
        int count;
        int mostType = 1;
        int mostNumber = 0;
        for (int i = 1; i <= 5; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (ar[j] == i) count++;
            }
            if (count > mostNumber){
                mostNumber = count;
                mostType = i;
            }
        }
        return mostType;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
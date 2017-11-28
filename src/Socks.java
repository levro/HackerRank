import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Socks {

    static int sockMerchant(int n, int[] ar) {
        int count = 1;
        int socks = 0;
        Arrays.sort(ar);
        int currentColor = ar[0];
        for (int i = 1; i < n; i++) {
            if (currentColor == ar[i]) count++;
            else {
                currentColor = ar[i];
                socks += count/2;
                count = 1;
            }
        }
        socks += count/2;
        return socks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
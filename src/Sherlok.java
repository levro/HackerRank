import java.util.*;

public class Sherlok {

    static String solve(int[] a){
        int n = a.length;
        if (n == 1) return "YES";
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            sum += a[i];
        }
        int left_sum = 0;
        for ( int i = 0; i < n-1 && 2 * left_sum <= sum; i++ ) {
            left_sum += a[i];
            if (sum - a[i+1] == 2 * left_sum) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long st = System.currentTimeMillis();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
        System.out.println("программа выполнялась " + (System.currentTimeMillis() - st) + " миллисекунд");
    }
}
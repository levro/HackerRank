import java.util.*;

public class SubarraySum {

    static long maximumSum(long[] a, long m) {
        int n = a.length;
        long max_sum = 0;

        for ( int sub_n = 1; sub_n < n; sub_n++ ) {
            for ( int sub_start = 0; sub_start < n - sub_n; sub_start++ ) {
                long sum = 0;
                for ( int i = 0; i < sub_n; i++ ) {
                    sum += a[i];
                }
                if (max_sum < sum % m) max_sum = sum;
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextLong();
            }
            long result = maximumSum(a, m);
            System.out.println(result);
        }
        in.close();
    }
}
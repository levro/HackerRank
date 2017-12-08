import java.util.*;

public class IcecremeParlor {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int t = in.nextInt();
        String out = "";
        for ( int i = 0; i < t; i++ ) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] c = new int[n];
            for(int c_i=0; c_i < n; c_i++){
                c[c_i] = in.nextInt();
            }

            for ( int j = 0; j < n - 1; j++ ) {
                for ( int k = j + 1; k < n; k++ ) {
                    if (c[j] + c[k] == m){
                        out += (j+1) + " " + (k+1) + "\n";
                        j = n;
                        k = n;
                    }
                }
            }
        }
        System.out.println(out);
    }
}

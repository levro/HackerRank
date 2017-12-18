import java.util.Arrays;
import java.util.Scanner;

public class FlippingMatrix {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int q = in.nextInt();
        for ( int q_i = 0; q_i < q; q_i++ ) {
            int n = in.nextInt();
            int[][] matrix = new int[2 * n][2 * n];
            for ( int i = 0; i < 2 * n; i++ ) {
                for ( int j = 0; j < 2 * n; j++ ) {
                    matrix[i][j] = in.nextInt();
                }
            }

            int[][] bestMatrix = new int[n][n];

            for ( int i = 0; i < n; i++ ) {
                for ( int j = 0; j < n; j++ ) {
                    bestMatrix[i][j] = Math.max( Math.max( matrix[i][j], matrix[2*n - i - 1][j] ), Math.max( matrix[2*n - i - 1][2*n - j - 1],  matrix[i][2*n - j - 1] ) );
                }
            }
            int sum = 0;

            for ( int[] row : bestMatrix) {
                for ( int a : row) {
                    sum += a;
                }
            }
            System.out.println(sum);
        }
    }
}

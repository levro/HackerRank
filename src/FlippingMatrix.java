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
            for ( int i = 0; i < 2 * n; i++ ) {
                System.out.println( Arrays.toString( matrix[i] ) );
            }

            for ( int i = n; i < 2 * n; i++ ) {
                matrix[i] = max2left(matrix[i]);
            }

            for ( int i = 0; i < n; i++ ) {
                int[] column = new int[2 * n];
                for ( int j = 0; j < 2 * n; j++ ) {
                    column[j] = matrix[j][i];
                }
                column = max2left( column );
                for ( int j = 0; j < 2 * n; j++ ) {
                    matrix[j][i] = column[j];
                }
            }
            for ( int i = 0; i < n; i++ ) {
                matrix[i] = max2left(matrix[i]);
            }
            System.out.println();

            for ( int i = 0; i < 2 * n; i++ ) {
                System.out.println( Arrays.toString( matrix[i] ));
            }


        }
    }

    private static int[] max2left( int[] row ) {
        int left  = 0;
        int right = 0;
        int n = row.length;
        for ( int i = 0; i < n / 2; i++ ) {
            left  += row[i];
            right += row[n - i - 1];
        }
        if (left < right){
            int tmp;
            for ( int i = 0; i < n / 2; i++ ) {
                tmp = row[i];
                row[i] = row[n - i - 1];
                row[n - i - 1] = tmp;
            }
        }
        return row;
    }
}

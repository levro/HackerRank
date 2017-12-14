import java.util.*;

public class GridChallenges {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int q = in.nextInt();
        for ( int test = 0; test < q; test++ ) {
            int n = in.nextInt();
            char[][] grid = new char[n][n];
            for(int i=0; i < n; i++){
                String line = in.next();
                for ( int j = 0; j < n; j++ ) {
                    grid[i][j] = line.charAt( j );
                }
            }

            for ( int i = 0; i < n; i++ ) {
                Arrays.sort( grid[i] );
            }

            System.out.println(isNorm(grid, n));
        }
    }

    private static String isNorm( char[][] grid, int n ) {
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j < n; j++ ) {
                if (grid[j-1][i] > grid[j][i]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
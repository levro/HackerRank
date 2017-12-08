import java.util.Scanner;

public class GridlandMetro {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int tracks = in.nextInt();
        int[][] gridLand = new int[rows][columns];
        int count = 0;
        for ( int j = 0; j < tracks; j++ ) {
            int trackRow = in.nextInt() - 1;
            int start = in.nextInt() - 1;
            int end = in.nextInt() - 1;
            for (int i = 0; i <= end - start; i++) {
                gridLand[trackRow][start + i] = 1;
            }
            count += end - start + 1;
        }

        System.out.println("Lampposts: " + (rows * columns - count));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(gridLand[i][j] + " ");
            }
            System.out.println();
        }

    }
}

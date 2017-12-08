import java.util.*;

public class GridlandMetro {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int tracks = in.nextInt();

        int[][] gridLand = new int[tracks][3];
        long count = 0;
        for ( int j = 0; j < tracks; j++ ) {
            gridLand[j][0] = in.nextInt();
            gridLand[j][1] = in.nextInt();
            gridLand[j][2] = in.nextInt();
            }

        Arrays.sort(gridLand, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < tracks; i++) {
            System.out.println(Arrays.toString(gridLand[i]));
        }








/*       System.out.println("Lampposts: " + (rows * columns - count));*/
    }
}

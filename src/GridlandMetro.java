import java.util.*;

public class GridlandMetro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int tracks = in.nextInt();

        int[][] gridLand = new int[tracks][3];

        for (int j = 0; j < tracks; j++) {
            gridLand[j][0] = in.nextInt();
            gridLand[j][1] = in.nextInt();
            gridLand[j][2] = in.nextInt();
        }

        long start = System.currentTimeMillis();

        Arrays.sort(gridLand, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (Integer.compare(o1[0], o2[0]) == 0)
                return Integer.compare(o1[1], o2[1]);
                else return Integer.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < tracks; i++) {
            System.out.println(Arrays.toString(gridLand[i]));
        }

        long count = 0;
        long currentCount = 0;
        long prevEnd = 0;
        int prevRow = -1;
        for (int[] track : gridLand) {

            if (track[0] != prevRow){
                count += currentCount;
                currentCount = track[2] - track[1] + 1;
                prevEnd = track[2];
                prevRow = track[0];
            }
            else{
                if (track[1] <= prevEnd){
                    if (track[2] <= prevEnd) continue;
                    else {
                        currentCount += track[2] - prevEnd;
                        prevEnd = track[2];
                    }
                }
                else{
                    currentCount += track[2] - track[1] + 1;
                    prevEnd = track[2];
                }
            }

        }
        count += currentCount;

        System.out.println("Tracks: " + count + ". Lampposts: " + ((long)columns * (long)rows - count));


        System.out.println("программа выполнялась " + (System.currentTimeMillis() - start) + " миллисекунд");
    }

}

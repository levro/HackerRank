import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LuckBalance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] contests = new int[n][2];
        for (int i = 0; i < n; i++) {
            int[] event = new int[2];
            event[0] =  in.nextInt();
            event[1] =  in.nextInt();
            contests[i] = event;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(contests[i]));
        }

        Arrays.sort(contests, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (Integer.compare(o1[1], o2[1]) == 0)
                    return Integer.compare(o2[0], o1[0]);
                else return Integer.compare(o1[1], o2[1]);
            }
        });
        System.out.println("------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(contests[i]));
        }

        int luck = 0;
        int losesCount = 0;
        for (int i = 0; i < n; i++) {
            if (contests[i][1] == 0) luck += contests[i][0];
            else{
                losesCount++;
                if (losesCount <= k) luck += contests[i][0];
                else luck -= contests[i][0];
            }
        }
        System.out.println("Luck amount: " + luck);
    }
}

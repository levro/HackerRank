import java.util.*;

public class Liderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] res = new int[alice.length];
        List<Integer> sc = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (i == 0 || scores[i] != scores[i - 1]) sc.add(scores[i]);
        }

        int[] scr = new int[sc.size()];
        for (int i = 0; i < sc.size(); i++) {
            scr[i] = sc.get(i);
        }

        for (int i = 0; i < alice.length; i++) {
            int aliceRank = 1;
            for (int j = 0; j < scr.length; j++) {
                if (alice[i] >= scr[j]) break;
                aliceRank++;
            }
            res[i] = aliceRank;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i = 0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i = 0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int[] result = climbingLeaderboard(scores, alice);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}

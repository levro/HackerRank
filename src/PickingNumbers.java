import java.util.*;

public class PickingNumbers {

    static int pickingNumbers(int[] a) {
        int[] gist = new int[100];
        for (int i = 0; i < a.length; i++) {
            gist[a[i]]++;
        }
        int maxPick = 0;
        for (int i = 0; i < 99; i++) {
            int pick = gist[i] + gist[i+1];
            if (pick > maxPick) maxPick = pick;
        }
        return maxPick;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
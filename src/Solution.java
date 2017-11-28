import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {

        int i = 0;
        int n = game.length;
        boolean jumped = false;

        while (i < n - 1){
            if (i == n - 1) return true;
            else if (i + leap >= n) return true;
            else if (game[i + 1] == 0) i++;
            else if (game[i + leap] == 0) i += leap;
            else {

                while (game[i] == 0 && i > 0) {
                    if (i + leap >= n) return true;
                    if (game[i - 1] == 0 && game[i - 1 + leap] == 0) {
                        i += leap - 1;
                        jumped = true;
                        continue;
                    } else i--;
                }
                if (jumped){
                    jumped = false;
                    continue;
                }
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

import java.util.*;

public class Powers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();

        System.out.println(powCount(x, n, 1));
    }

    private static int powCount(int x, int n, int num) {
        if ((int)Math.pow(num, n) < x){
            return powCount(x, n, num+1) + powCount(x - (int)Math.pow(num, n), n, num+1);
        }
        else if ((int)Math.pow(num, n) == x) return 1;
        else return 0;
    }
}

import java.util.*;


public class UtopianTree {

    static int utopianTree(int n) {
        int tree = 1;
        for (int i = 0; i < n / 2; i++) {
            tree *= 2;
            tree++;
        }
        if (n % 2 == 1) tree *= 2;
        return tree;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
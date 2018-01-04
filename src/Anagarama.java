import java.util.*;

public class Anagarama {

    static int anagaram(String s) {
        int n = s.length()/2;
        if (n * 2 != s.length()){
            return  -1;
        }
        char[] a = s.substring(0, n).toCharArray();
        char[] b = s.substring(n).toCharArray();

        int[] ab = new int[26];
        for (int i = 0; i < n; i++) {
            ab[a[i] - 97]++;
            ab[b[i] - 97]--;
        }
        int result = 0;
        for (int x : ab) {
            result += Math.abs(x);
        }
        return result / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagaram(s);
            System.out.println(result);
        }
    }
}

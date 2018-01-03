import java.util.*;

public class RichieRich {

    static String richieRich(String s, int n, int k){
        int must = 0;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) must++;
        }
        if (must > k) return "-1";

        int free = k - must;
        char[] ss = s.toCharArray();

        for (int i = 0; i < (n + 1) / 2; i++) {
            if (ss[i] != ss[n - 1 - i]){
                if (free > 0){
                    if (ss[i] != '9' && ss[n - 1 - i] != '9') free--;
                    ss[i] = '9';
                    ss[n - 1 - i] = '9';
                }
                else {
                    char max = (char)Math.max(ss[i], ss[n - 1 - i]);
                    ss[i] = max;
                    ss[n - 1 - i] = max;
                }
            }
            else{
                if (free > 1 || i * 2 + 1 == n && free > 0){
                    if (ss[i] != '9') free -= 2;
                    ss[i] = '9';
                    ss[n - 1 - i] = '9';
                }
            }
        }
        return new String(ss);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}
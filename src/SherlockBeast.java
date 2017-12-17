import java.util.*;

public class SherlockBeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long t0=System.currentTimeMillis();
            System.out.println(maxDescent(n));
            long t1=System.currentTimeMillis();
            System.out.println("Done in "+(t1-t0)+" ms");
        }
    }

    private static StringBuilder maxDescent(int n) {
        for (int i = 0; i <= n; i += 5) {
            if ((n - i) % 3 == 0){
                return strOf(n - i, '5').append( strOf(i, '3') );
            }
        }
        return new StringBuilder("-1");
    }

    private static StringBuilder strOf(int i, char s) {
        StringBuilder str = new StringBuilder();
        for (int j = 0; j < i; j++) {
            str.append(s);
        }
        return str;
    }
}

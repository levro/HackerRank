import java.util.*;

public class Triangle {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int n = in.nextInt();
        Integer[] stick = new Integer[n];
        for(int i=0; i < n; i++){
            stick[i] = in.nextInt();
        }
        Arrays.sort(stick, Collections.reverseOrder());

        System.out.println(Arrays.toString( stick ));

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (triNorm(stick[i], stick[j], stick[k])){
                        System.out.println(stick[k] + " " + stick[j] + " " + stick[i]);
                        found = true;
                        i = n;
                        j = n;
                        k = n;
                    }
                }
            }
        }
        if (!found) System.out.println(-1);
    }

    private static boolean triNorm( int a, int b, int c ) {
        if (a+b <= c || a+c <= b || b+c <= a) return false;
        return true;
    }
}

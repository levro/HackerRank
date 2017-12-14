import java.lang.reflect.Array;
import java.util.*;

public class Triangle {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);
        int n = in.nextInt();
        int[] stick = new int[n];
        for(int i=0; i < n; i++){
            stick[i] = in.nextInt();
        }
        System.out.println(Arrays.toString( stick ));

        List<int[]> tri = new ArrayList<>(  );

        for ( int i = 0; i < n - 2; i++ ) {
            for ( int j = 1; j < n - 1; j++ ) {
                for ( int k = 2; k < n; k++ ) {
                    if (i != j & j != k && i != k){
                        if (triNorm(stick[i], stick[j], stick[k])){
                            tri.add( new int[]{stick[i], stick[j], stick[k]} );
                        }
                    }
                }
            }
        }
        for ( int[] tr : tri) {
            System.out.println( Arrays.toString( tr ));
        }






    }

    private static boolean triNorm( int a, int b, int c ) {
        if (a+b <= c || a+c <= b || b+c <= a) return false;
        return true;
    }
}

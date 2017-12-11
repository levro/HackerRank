import java.util.*;

public class MissingNumbers {
    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in);
        int n = in.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i=0; i < n; i++){
            A.add( in.nextInt() );
        }
        int m = in.nextInt();
        List<Integer> B = new ArrayList<>();
        for(int i=0; i < m; i++){
            B.add( in.nextInt() );
        }

        System.out.println(A);
        System.out.println(B);

        for ( Integer num : A) {
            int index = B.indexOf(num);
            if (index >= 0) B.remove(index);
        }

        Collections.sort( B );

        System.out.println(B);

        for ( int i = 1; i < B.size(); i++ ) {
            int curr = B.get(i);
            int prev = B.get(i - 1);
            if (curr == prev){
                B.remove(i);
                i--;
            }
        }

        for ( Integer nmb : B) {
            System.out.print(nmb + " ");
        }

    }
}

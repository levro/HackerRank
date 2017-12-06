import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class HackerlandRadio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        Arrays.sort( x );
        String city = ".";
        String cityN = "";
        System.out.println(Arrays.toString( x ));
        System.out.println();
        for ( int i = 1; i <= x[x.length - 1]; i++ ) {
            if ( Arrays.binarySearch(x, i) >= 0 ) city += "|||.";
            else city += "___.";
            cityN += "  " + i + " ";
        }
        System.out.println(city);
        System.out.println(cityN);

        List<Integer> rad = new ArrayList<>();

        int house = 0;
        int radio = 1;
        do {

            for ( int j = radio; x[j]-k <= x[house]; j++ ) {
                radio = j;
            }
            rad.add( radio );
            house = radio + 1;
            radio = house + 1;


        } while ( x[radio] + k <= x[x.length - 1] );

        if (radio != rad.get( rad.size() - 1 ) && radio <= x.length - 1){
            rad.add( radio );
        }

        for ( Integer a : rad) {
            System.out.print("" + a + " ");
        }

    }
}
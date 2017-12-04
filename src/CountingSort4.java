import java.util.Arrays;
import java.util.Scanner;

public class CountingSort4 {
    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in);
        int max = 0;

        int s = in.nextInt();
        StringBuilder[] ar = new StringBuilder[100];
        for(int i=0;i<s;i++){
            int index = in.nextInt();
            String text = in.next();
            if (ar[index] == null) ar[index] = new StringBuilder( "" );
            if (i >= s / 2) ar[index].append( text + " " );
            else ar[index].append( "- ");
            if (max < index) max = index;
        }

        for ( StringBuilder str :  Arrays.copyOf( ar, max + 1 )) {
            System.out.print(str);
        }

    }
}
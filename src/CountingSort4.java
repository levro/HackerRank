import java.util.Arrays;
import java.util.Scanner;

public class CountingSort4 {
    public static void main( String[] args ) {
        long st = System.currentTimeMillis();
        Scanner in = new Scanner( System.in);
        int max = 0;
        int index;
        String text;
        int s = in.nextInt();
        String[] ar = new String[s];
        for(int i=0;i<s;i++){
            index = in.nextInt();
            text = in.next();
            if (ar[index] == null) ar[index] = new String( "" );
            if (i >= s / 2) ar[index] += text + " ";
            else ar[index] += "- ";
            if (max < index) max = index;
        }

        long st1 = System.currentTimeMillis();

        for ( String str :  Arrays.copyOf( ar, max + 1 )) {
            System.out.print(str);
        }

        long end = System.currentTimeMillis();
        System.out.println("First part: " + (st1-st) + ". Seconf part: " + (end-st1));
    }
}
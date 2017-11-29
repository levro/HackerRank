import java.util.*;
public class FindDigits {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num, numDiv, length, rem, count;
        for ( int i = 0; i < n; i++ ) {
            num = in.nextInt();
            numDiv = num;
            length = Integer.toString( num ).length();
            count = 0;
            for ( int j = 0; j < length; j++ ) {
                rem = numDiv % 10;
                numDiv /= 10;
                if (rem == 0) continue;
                else if (num % rem == 0) count++;
            }
            System.out.println(count);
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pairs {
    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] numbers = new int[n];
        for(int i=0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int count = 0;

        for ( int i = 0; i < n - 1; i++ ) {
            for ( int j = i + 1; j < n && numbers[j] - numbers[i] <= k; j++ ) {
                if (numbers[j] - k == numbers[i]) count++;
            }
        }

        System.out.println(count);






    }
}


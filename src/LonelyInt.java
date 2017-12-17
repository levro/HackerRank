import java.util.*;

public class LonelyInt {

    static int lonelyinteger(int[] a) {
        int out = 0;
        int[] numbers = new int[101];
        for (int i = 0; i < a.length; i++) {
            numbers[a[i]]++;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) out = i;
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
import java.util.*;

public class StringConstruction {

    static int stringConstruction(String s) {
        int[] abc = new int[26];
        for (int n : s.toCharArray()) {
            abc[n - 97]++;
        }
        int count = 0;
        for (int m : abc) {
            if (m > 0) count++;
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
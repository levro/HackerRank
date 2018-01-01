import java.util.*;

public class LoveLetter {

    static int theLoveLetterMystery(String s){
        int count = 0;
        for (int i = 0; i <= s.length() / 2 - 1; i++) {
            count += Math.abs((int)s.charAt(i) - (int)s.charAt(s.length() - 1 - i));
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
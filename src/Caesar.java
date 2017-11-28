import java.util.*;

public class Caesar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        if (k > 25) k = k % 26;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                s = s.substring(0, i) + encode(s.charAt(i), k) + s.substring(i + 1);
            }
        }
        System.out.println(s);
    }

    static char encode(char a, int k){
        int aa = (int)a;
        boolean isUp = Character.isUpperCase(a);
        if ((isUp && aa > 90 - k) || (!isUp && aa > 122 - k)){
            a = (char)(aa + k - 26);
        }
        else{
            a = (char)(aa + k);
        }
        return a;
    }
}
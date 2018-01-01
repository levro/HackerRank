import java.util.*;

public class GameOfThrone1 {

    static String gameOfThrones(String s){
        int[] abc = new int[26];
        for (int n : s.toCharArray()) {
            abc[n - 97]++;
        }
        boolean flag = true;
        for (int m : abc) {
            if (m % 2 != 0){
                if (flag) flag = false;
                else return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
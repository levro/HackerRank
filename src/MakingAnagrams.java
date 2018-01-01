import java.util.*;

public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2){
        int[] abc = new int[26];
        for (int n : s1.toCharArray()) {
            abc[n - 97]++;
        }
        for (int n : s2.toCharArray()) {
            abc[n - 97]--;
        }
        int count = 0;
        for (int m : abc) {
            count += Math.abs(m);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
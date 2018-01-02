import java.util.*;

public class SherlockAnagram {

    static int sherlockAndAnagrams(String s){
        int count = 0;
        for ( int i = 1; i < s.length(); i++ ) {
            for ( int j = 0; j < s.length() - i; j++ ) {
                for ( int k = j + 1; k <= s.length() - i; k++ ) {
                    if (isAnagrams(s.substring( j, j + i ), s.substring( k, k + i ))){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean isAnagrams(String s1, String s2){
        int[] abc = new int[26];
        for (int n : s1.toCharArray()) {
            abc[n - 97]++;
        }
        for (int n : s2.toCharArray()) {
            abc[n - 97]--;
        }
        for ( int n : abc) {
            if (n != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
    }
}
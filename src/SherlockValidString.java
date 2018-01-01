import java.util.*;

public class SherlockValidString {

    static String isValid(String s){
        int[] abc = new int[26];
        for (int n : s.toCharArray()) {
            abc[n - 97]++;
        }
        List<Integer> letters = new ArrayList<>();
        for (int m : abc) {
            if (m > 0){
                letters.add(m);
            }
        }
        System.out.println(letters);

        if (letters.size() == 0 || letters.size() == 1) return "YES";
        int frq = (letters.get(0) + letters.get(1)) / 2;

        for (int i = 0; i < letters.size(); i++) {
            if (letters.get(i) == frq){
                letters.remove(i);
                i--;
            }
        }
        System.out.println(letters);
        if (letters.size() == 0) return "YES";
        if (letters.size() > 1) return "NO";
        else if (letters.get(0) - 1 == frq) return "YES";
        else if (letters.get(0) == 1) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
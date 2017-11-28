import java.util.*;

public class TwoChar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        List<Character> chars = new ArrayList<>();
        boolean flag;

        for (int i = 0; i < len; i++) {
            flag = true;
            for (Character sym : chars) {
                if (sym == s.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if (flag) chars.add(s.charAt(i));
        }
        System.out.println(chars);

        String s1;
        int maxT = s.length() == 1 ? 1 : 0;
        int currentT;

        for (int i = 0; i < chars.size() - 1; i++) {
            for (int j = i + 1; j < chars.size(); j++) {
                s1 = s;
                for (Character ch : chars) {
                    if (ch != chars.get(i) && ch != chars.get(j)) s1 = s1.replace(ch.toString(), "");
                }
                currentT = isT(s1);
                System.out.println(s1);
                if (currentT > maxT) maxT = currentT;
            }
        }
        System.out.println(maxT);
    }

    static int isT(String str){
        if (str.length() < 2) return str.length();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) return  0;
        }
        return str.length();
    }
}
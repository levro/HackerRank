import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniformString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        long st = System.currentTimeMillis();

        List<Integer> U = new ArrayList<>();

        int weight = 0;
        char current;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            weight += (int)current - 96;
            U.add(weight);
            if (i != s.length() - 1 && current != s.charAt( i + 1 )){
                weight = 0;
            }
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.println("Test #" +a0 + " - " + (U.contains(x) ? "Yes" : "No"));
        }
        System.out.println("программа выполнялась " + (System.currentTimeMillis() - st) + " миллисекунд");
    }
}
import java.util.Scanner;

public class UniformString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        long st = System.currentTimeMillis();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.println("Test #" +a0 + " - " + isU(s, x));
        }
        System.out.println("программа выполнялась " + (System.currentTimeMillis() - st) + " миллисекунд");
    }
    static String isU(String str, int x){
        int weight = 0;
        char current;
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            weight += (int)current - 96;
            if (weight == x) return "Yes";
            if (i != str.length() - 1 && current != str.charAt( i + 1 )){
                weight = 0;
            }
        }
        return "No";
    }
}
import java.util.Scanner;

public class CounterGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int t_i = 0; t_i < t; t_i++) {
            long n = in.nextLong();

            int turn = 0;
            int count = 0;
            while (n > 1) {
                count++;
                turn = turn ^ 1;
                for (long i = 1; i <= n; i = i * 2) {
                    if (i * 2 > n) {
                        n = n - i;
                    }
                    if (i * 2 == n) {
                        n = i;
                    }
                }
            }
            System.out.println(count);
            System.out.println(turn == 0 ? "Richard" : "Luise");

        }
    }
}
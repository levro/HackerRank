import java.util.*;

public class Clouds {

    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int i = 0;
        do{
            if (i < c.length - 2) i +=2;
            else i++;
            steps++;
            if (c[i] == 1){
                steps++;
                i++;
            }
        }while (i < c.length - 1);
        return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
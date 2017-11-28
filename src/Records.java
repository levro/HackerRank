import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Records {

    static int[] getRecord(int[] s){
        int[] rec = new int[]{0,0};
        int maxRec = s[0];
        int mminRec = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i] > maxRec){
                maxRec = s[i];
                rec[0]++;
            }
            if (s[i] < mminRec){
                mminRec = s[i];
                rec[1]++;
            }
        }
        return rec;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
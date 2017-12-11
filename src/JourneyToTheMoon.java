import java.io.*;
import java.util.*;

public class JourneyToTheMoon {
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);

        ArrayList<Set<Integer>> countrymans = new ArrayList<>();

        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            // Store a and b in an appropriate data structure of your choice

            int zafigacheno = -1;
            for (int j = 0; j < countrymans.size(); j++) {
                if(countrymans.get(j).contains(a) || countrymans.get(j).contains(b)){
                    countrymans.get(j).add(a);
                    countrymans.get(j).add(b);
                    if (zafigacheno != -1){
                        countrymans.get(zafigacheno).addAll(countrymans.get(j));
                        countrymans.remove(j);
                        continue;
                    }
                    zafigacheno = j;
                }
            }

            if (zafigacheno == -1){
                Set<Integer> cm = new HashSet<>();
                cm.add(a);
                cm.add(b);
                countrymans.add(cm);
            }
        }

        for (Set<Integer> cm : countrymans) {
            System.out.println(cm);
        }

        long combinations = combinat(N);
        // Compute the final answer - the number of combinations
        for (Set<Integer> cm : countrymans) {
            combinations -= combinat(cm.size());
        }
        System.out.println(combinations);
    }
    private static long combinat(long n) {
        return (n * (n - 1) / 2);
    }
}

import java.util.*;

public class SortTutor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i < n; i++){
            ar.add(in.nextInt());
        }
        System.out.println(ar.indexOf(v));
    }
}

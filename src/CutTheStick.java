import java.util.*;

public class CutTheStick {

    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        Map kk = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (kk.containsKey(arr[i])){
                int x = (int)kk.get(arr[i]);
                kk.put(arr[i], x + 1);
            }
            else kk.put(arr[i], 1);
        }
        int[] res = new int[kk.size()];

        for (Object key : kk.keySet()) {
            System.out.println(key + ": " + kk.get(key));
        }
        return new int[]{1};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}

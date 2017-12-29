import java.util.*;

public class GemStones {

    static int gemstones(String[] arr){
        int counter = 0;
        char[] letters = new char[]{97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
        for (char a : letters) {
            boolean flag = true;
            for (String s : arr) {
                if (flag && s.contains(""+a)) continue;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                counter++;
                System.out.println(a);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
        System.out.println(Arrays.toString(arr));
    }
}

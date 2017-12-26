import java.util.*;

public class FraudulentActivity {

    static int activityNotifications(int[] expenditure, int d) {
        int noti = 0;

        if (expenditure.length < d + 1) return 0;
        for ( int i = 0; i < expenditure.length - d; i++ ) {

            int[] five = new int[d];
            System.arraycopy( expenditure, i, five, 0, d );
            int med = mediane( five );
            if (expenditure[i + d] >= med * 2) noti++;

        }
        return noti;
    }

    private static int mediane( int[] arr ) {
        Arrays.sort( arr );
        int median;
        if (arr.length % 2 == 0){
            median = (arr[arr.length/2] + arr[arr.length - 1]) / 2;
        }
        else median = arr[arr.length/2];
        return median;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] expenditure = new int[n];
        for(int expenditure_i = 0; expenditure_i < n; expenditure_i++){
            expenditure[expenditure_i] = in.nextInt();
        }
        int result = activityNotifications(expenditure, d);
        System.out.println();
        System.out.println(result);
        in.close();
    }

}
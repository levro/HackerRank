import java.util.ArrayList;
import java.util.List;

public class Tstst {
    public static void main( String[] args ) {

        long start = System.currentTimeMillis();

        ArrayList<ArrayList<Integer>> countrymans = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            ArrayList<Integer> cm = new ArrayList<>();
            for (int j = 0; j < 1000; j++) {
                cm.add(j);
            }
            countrymans.add(cm);
        }



        System.out.println("программа выполнялась " + (System.currentTimeMillis() - start) + " миллисекунд");
    }
}

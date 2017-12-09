import java.util.*;

public class GridlandMetro_release {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int tracks = in.nextInt();

        int[][] gridLand = new int[tracks][3];
        long count = 0;
        for ( int j = 0; j < tracks; j++ ) {
            gridLand[j][0] = in.nextInt();
            gridLand[j][1] = in.nextInt();
            gridLand[j][2] = in.nextInt();
        }
        long start = System.currentTimeMillis();
        Arrays.sort(gridLand, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        long middle = System.currentTimeMillis();
        int previousRowNo = -1;
        List<String> uTracks = new ArrayList<>();

        for (int[] trk : gridLand) {
            if (trk[0] != previousRowNo){
                uTracks.add(generateRow(columns, "0"));
            }
            previousRowNo = trk[0];
            uTracks.set(uTracks.size() - 1, putTrack(uTracks.get(uTracks.size() - 1), trk[1], trk[2]));
            //System.out.println("+1");
        }

        for (String s : uTracks) {
            count += countOnes(s);
        }

        long lampposts = (long)columns * (long)rows - count;
        System.out.println(lampposts);
        System.out.println("программа выполнялась " + (middle - start) + " + " + (System.currentTimeMillis() - middle) + " миллисекунд");

    }

    private static long countOnes(String s) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        return  count;
    }

    private static String putTrack(String str, int start, int end) {
        return str.substring(0, start - 1) + generateRow(end - start + 1, "1") + str.substring(end);
    }

    public static String generateRow(int columns, String chr){
        String str = "";
        for (int i = 0; i < columns; i++) {
            str += chr;
        }
        return str;
    }
}

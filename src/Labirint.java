public class Labirint {
    public static void main(String[] args) {

        int[] gate1 = new int[]{38,42,8,29};
        int[] gate2 = new int[]{21,36,28,44};
        int[] gate3 = new int[]{14,15,18,16};
        int[] gate4 = new int[]{7,9,10,19};

        long startTime = System.currentTimeMillis();
        for (int g1: gate1) {
            for (int g2: gate2) {
                for (int g3: gate3) {
                    for (int g4: gate4) {
                        if (g1 + g2 + g3 + g4 == 100){
                            System.out.printf("Ворота1 %d, ворота2 %d, ворота3 %d, ворота4 %d.\n", g1, g2, g3, g4);
                        }
                    }
                }
            }
        }
        long finishTime = System.currentTimeMillis();

        System.out.println("Время работы программы " + (finishTime - startTime) + "мс");





    }
}

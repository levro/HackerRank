public class CoinsEtalon {
    private static int[] COINS_NOM = {1, 5, 10, 20, 50, 100};

    public static long getCountOfWays(int money) {
        return getCountOfWays(money, COINS_NOM.length - 1);
    }

    /**
     * КАК ДО ТАКОГО ДОДУМАТЬСЯ???
     */
    private static long getCountOfWays(int money, int indexOfCoin) {
        if (money < 0 || indexOfCoin < 0) return 0;
        if (money == 0 || indexOfCoin == 0) return 1;
        return getCountOfWays(money, indexOfCoin - 1) + getCountOfWays(money - COINS_NOM[indexOfCoin], indexOfCoin);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long res = getCountOfWays(5000);
        System.out.println(res);
        System.out.println("программа выполнялась " + (System.currentTimeMillis() - start) + " миллисекунд");
    }
}
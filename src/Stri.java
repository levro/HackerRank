import java.math.BigInteger;
import java.util.Scanner;

public class Stri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        BigInteger aPLUSb;
        BigInteger aMULTIPLEb;

        BigInteger bigA = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);

        aPLUSb = bigA.add(bigb);
        aMULTIPLEb = bigA.multiply(bigb);

        System.out.println(aPLUSb.toString());
        System.out.println(aMULTIPLEb.toString());

    }
}

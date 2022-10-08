package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class UCLN_BigInt {
    static BigInteger ucln(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }
    static BigInteger bcnn(BigInteger a, BigInteger b){return a.multiply(b).divide(ucln(a,b));}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(bcnn(a,b));
        }
    }
}

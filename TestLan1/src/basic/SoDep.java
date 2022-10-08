package basic;

import java.math.BigInteger;
import java.util.Scanner;

public class SoDep {
    static int soCS(BigInteger a) {
        int count = 0;
        while (a.compareTo(BigInteger.ONE) > 0) {
            a = a.divide(BigInteger.valueOf(10));
            count++;
        }
        return count;
    }

    static boolean soDep(BigInteger a) {
        String so = String.valueOf(a);
        for (int i = 0; i < soCS(a) / 2; i++) {
            if (so.charAt(i) != so.charAt(soCS(a) - i - 1)
                    || Integer.parseInt(String.valueOf(so.charAt(i))) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger a = scanner.nextBigInteger();
            if (soDep(a)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}

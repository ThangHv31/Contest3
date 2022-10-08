package test1_1;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai1 {
    public static void tachSo(String n) {
        if (n.length() % 2 == 0) {
            BigInteger a = new BigInteger(n.substring(0, n.length() / 2));
            BigInteger b = new BigInteger(n.substring(n.length() / 2));
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        } else {
            System.out.println("INVALID");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n != 0) {
            BigInteger k = scanner.nextBigInteger();
            String a = k.toString();
            tachSo(a);
            n--;
        }
    }
}

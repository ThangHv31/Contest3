package test1_1;

import java.math.BigInteger;
import java.util.Scanner;

public class BAi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            if (n == 0) break;
            BigInteger[] a = new  BigInteger[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextBigInteger();
            }
            BigInteger max = a[0];
            BigInteger min = a[0];
            for (int i = 1; i < n; i++) {
                max = max.max(a[i]);
            }
            for (int i = 1; i < n; i++) {
                min = min.min(a[i]);
            }
            System.out.println(max == min ? "BANG NHAU": min +" "+ max);
        }
    }
}

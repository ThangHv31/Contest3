package contest3;

import java.util.Scanner;

public class TinhLuyThua {
    static final long M = 1000000007L;

    public TinhLuyThua() {
    }

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        while(true) {
            int n = inScanner.nextInt();
            long k = inScanner.nextLong();
            if (n == 0 && k == 0L) {
                return;
            }

            System.out.println(powMod(n, k));
        }
    }

    public static long powMod(int n, long k) {
        if (k == 0L) {
            return 1L;
        } else {
            long x = powMod(n, k / 2L);
            return k % 2L == 0L ? x * x % 1000000007L : (long)n * (x * x % 1000000007L) % 1000000007L;
        }
    }
}

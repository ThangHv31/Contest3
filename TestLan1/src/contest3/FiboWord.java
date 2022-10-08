package contest3;

import java.util.Scanner;

public class FiboWord {
    static long[] F = new long[100];

    public FiboWord() {
    }

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        F[0] = 0L;
        F[1] = 1L;

        int t;
        for(t = 2; t <= 92; ++t) {
            F[t] = F[t - 1] + F[t - 2];
        }

        t = inScanner.nextInt();
        inScanner.nextLine();

        while(t-- > 0) {
            int n = inScanner.nextInt();
            long k = inScanner.nextLong();
            if (n == 0 && k == 0L) {
                break;
            }

            System.out.println(fiboWordN(n, k));
        }

    }

    public static char fiboWordN(int n, long k) {
        if (n == 1) {
            return 'A';
        } else if (n == 2) {
            return 'B';
        } else {
            return k <= F[n - 2] ? fiboWordN(n - 2, k) : fiboWordN(n - 1, k - F[n - 2]);
        }
    }
}

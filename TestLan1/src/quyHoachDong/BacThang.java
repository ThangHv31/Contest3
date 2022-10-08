package quyHoachDong;

import java.util.Scanner;

public class BacThang {
    public static void main(String[] args) {
        int mod = (int) 1e9 + 7;
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), k = scanner.nextInt();
            int f[] = new int[n + 5];
            f[0] = 1;
            f[1] = 1;
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= Math.min(i, k); j++) {
                    f[i] = (f[i - j] + f[i]) % mod;
                }
            }
            System.out.println(f[n]);
        }
    }
}

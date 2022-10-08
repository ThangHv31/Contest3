package contest3;

import java.util.Scanner;

public class SoPhatLoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 6) {
            generate(n);
        }
    }

    private static void generate(int n) {
        int[] str = new int[17];

        for (int i = 1; i <= n; ++i) {
            str[i] = 6;
        }

        while (true) {
            boolean ok = true;
            int i;
            if (str[1] == 8 && str[n] == 6) {
                for (i = 1; i <= n; ++i) {
                    if (str[i] == 8 && str[i + 1] == 8) {
                        ok = false;
                        break;
                    }

                    if (str[i] == 6 && str[i + 1] == 6 && str[i + 2] == 6 && str[i + 3] == 6) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    for (i = 1; i <= n; ++i) {
                        System.out.print(str[i]);
                    }

                    System.out.println();
                }
            }

            for (i = n; str[i] == 8 && i >= 1; --i) {
                str[i] = 6;
            }

            if (i <= 0) {
                return;
            }

            str[i] = 8;
        }
    }

}

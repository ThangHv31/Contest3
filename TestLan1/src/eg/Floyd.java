/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Floyd {

    static int a[][] = new int[105][105];
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, u, v, w;
        n = sc.nextInt();
        m = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = (int) 1e9;
                }
            }
        }
        for (i = 1; i <= m; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            w = sc.nextInt();
            a[u][v] = w;
            a[v][u] = w;
        }
        Floyd();
        int q = sc.nextInt();
        while (q-- > 0) {
            u = sc.nextInt();
            v = sc.nextInt();
            System.out.println(a[u][v]);
        }
    }

    public static void Floyd() {
        int i, j, k;
        for (k = 1; k <= n; k++) {
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= n; j++) {
                    if (a[i][j] > a[i][k] + a[k][j]) {
                        a[i][j] = a[i][k] + a[k][j];
                    }
                }
            }
        }
    }

}

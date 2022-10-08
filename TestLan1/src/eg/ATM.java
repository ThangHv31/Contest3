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
public class ATM {

    static int n, S;
    static int[] a, x;
    static boolean check;

    static void Result(int k) {
        int i = k;
        while (i > 0 && x[i] == n - k + i) {
            i--;
        }
        if (i > 0) {
            x[i] += 1;
            for (int j = i + 1; j <= k; j++) {
                x[j] = x[j - 1] + 1;
            }
        } else {
            check = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            S = sc.nextInt();
            a = new int[35];
            x = new int[35];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int res = -1;
            for (int i = 1; i <= n; i++) {
                check = false;
                for (int j = 1; j <= i; j++) {
                    x[j] = j;
                }
                while (check == false && res == -1) {
                    int sum = 0;
                    for (int j = 1; j <= i; j++) {
                        sum += a[x[j]];
                    }
                    if (sum == S) {
                        res = i;
                        check = true;
                    }
                    Result(i);
                }
            }
            System.out.println(res);
        }
    }
}

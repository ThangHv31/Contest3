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
public class Day_Con_Tang_Dai_Nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[t + 1];
        int f[] = new int[t + 1];
        for (int i = 1; i <= t; i++) {
            a[i] = sc.nextInt();
        }
        int res = 1;
        for (int i = 1; i <= t; i++) {
            f[i] = 0;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            res = Math.max(res, f[i]);
        }
        System.out.println(res);
    }
}

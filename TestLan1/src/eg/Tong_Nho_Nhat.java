/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Tong_Nho_Nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long s1 = 0;
            long s2 = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    s1 = s1 * 10 + a[i];
                } else {
                    s2 = s2 * 10 + a[i];
                }
            }
            System.out.println(s1 + s2);
        }
    }
}

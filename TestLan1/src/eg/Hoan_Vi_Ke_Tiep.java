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
public class Hoan_Vi_Ke_Tiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a[] = new int[1005];
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int i;
            for (i = n - 1; i > 0; i--) {
                if (a[i] > a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    Arrays.sort(a, i, n);
                    break;
                }
            }
            if(i == 0) {
                Arrays.sort(a, 0, n);
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}

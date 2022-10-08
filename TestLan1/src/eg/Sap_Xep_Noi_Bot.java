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
public class Sap_Xep_Noi_Bot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[105];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i, j;
        boolean check = false;
        for (i = 0; i < n - 1; i++) {
            check = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = true;
                }
            }
            if (check) {
                System.out.printf("Buoc " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    System.out.printf(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

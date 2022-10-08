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
public class Sap_Xep_Chon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[105];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index;
        for (int i = 0; i < n - 1; i++) {
            index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            int tmp = a[index];
            a[index] = a[i];
            a[i] = tmp;
            System.out.printf("Buoc " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.printf(a[k] + " ");
            }
            System.out.println();
        }
    }
}

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
public class Sap_Xep_Chen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[105];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index, x;
        System.out.println("Buoc 0: " + a[0]);
        for (int i = 1; i < n; i++) {
            x = a[i];
            index = i - 1;
            while (index >= 0 && a[index] > x) {
                a[index + 1] = a[index];
                index--;
            }
            a[index + 1] = x;
            System.out.printf("Buoc " + i + ": ");
            for (int j = 0; j <= i; j++) {
                System.out.printf(a[j] + " ");
            }
            System.out.println();
        }
    }
}

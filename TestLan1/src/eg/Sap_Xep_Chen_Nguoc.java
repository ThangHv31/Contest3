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
public class Sap_Xep_Chen_Nguoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[105];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index, x;
        int dem = 0;
        String s[] = new String[n + 5];
        s[dem] = "Buoc 0: " + a[0];
        dem++;
        for (int i = 1; i < n; i++) {
            x = a[i];
            index = i - 1;
            while (index >= 0 && a[index] > x) {
                a[index + 1] = a[index];
                index--;
            }
            a[index + 1] = x;
            s[dem] = "Buoc " + i + ": ";
            for (int j = 0; j <= i; j++) {
                s[dem] = s[dem] + a[j] + " ";
            }
            dem++;
        }
        for (int i = dem - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}

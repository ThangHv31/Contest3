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
public class Sap_Xep_Noi_Bot_Nguoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a[] = new int[105];
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int i, j;
            int dem = 0;
            boolean check = false;
            String s[] = new String[n + 5];
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
                    s[dem] = "Buoc " + (i + 1) + ": ";
                    for (int k = 0; k < n; k++) {
                        s[dem] = s[dem] + a[k] + " ";
                    }
                    dem++;
                }
            }
//            System.out.println(dem);
            for (int x = dem - 1; x >= 0; x--) {
                System.out.println(s[x]);
            }
        }
    }
}

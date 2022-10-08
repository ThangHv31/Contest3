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
public class Hoan_Vi_Nguoc {

    static final int maxx = 11;
    static int a[];
    static int check[];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            a = new int[maxx];
            check = new int[maxx];
            for (int i = 0; i <= n; i++) {
                a[i] = 0;
                check[i] = 0;
            }
            n = sc.nextInt();
            HoanVi(n);
            System.out.println("");
        }
    }

    public static void HoanVi(int x) {
        for (int i = n; i >= 1; i--) {
            if (check[i] == 0) {
                a[x] = i;
                check[i] = 1;
                if (x == 1) {
                    Result();
                } else {
                    HoanVi(x - 1);
                }
                check[i] = 0;
            }
        }
    }

    public static void Result() {
        for (int i = n; i >= 1; i--) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}

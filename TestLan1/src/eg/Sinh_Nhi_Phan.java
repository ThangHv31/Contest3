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
public class Sinh_Nhi_Phan {

    private static int a[] = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        SinhNhiPhan(n, "");
        SinhNhiPhan(n, 0);
    }

//    private static void SinhNhiPhan(int n, String s) {
//        if (n == 0) {
//            System.out.print(s + " ");
//        } else {
//            for (int i = 0; i <= 1; i++) {
//                SinhNhiPhan(n - 1, s + (char) (i + '0'));
//            }
//        }
//    }
    private static void SinhNhiPhan(int n, int x) {
        if (n == 0) {
            for (int j = 0; j < x; j++) {
                System.out.print(a[j]+"");
            }
            System.out.println("");
        } else {
            for (int i = 0; i <= 1; i++) {
                a[x] = i;
                SinhNhiPhan(n - 1, x+1);
            }
        }
    }
}

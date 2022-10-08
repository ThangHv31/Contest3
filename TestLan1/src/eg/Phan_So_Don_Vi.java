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
public class Phan_So_Don_Vi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long tu = sc.nextInt();
            long mau = sc.nextInt();
            Result(tu, mau);
        }
    }

    public static void Result(long tu, long mau) {
        if (mau % tu == 0) {
            System.out.println(1 + "/" + (mau / tu));
        } else {
            long x = mau / tu + 1;
            System.out.print(1 + "/" + x + " + ");
            Result(x * tu - mau, x * mau);
        }
    }
}

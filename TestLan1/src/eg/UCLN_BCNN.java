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
public class UCLN_BCNN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long x = a;
            long y = b;
            while (b % a != 0) {
                long temp = b % a;
                b = a;
                a = temp;
            }
            System.out.println(x * y / a + " " + a);
        }
    }
}

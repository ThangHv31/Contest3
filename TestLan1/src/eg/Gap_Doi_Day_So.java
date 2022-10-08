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
public class Gap_Doi_Day_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(GapDoi(n, k));
        }
    }

    public static int GapDoi(int n, long k) {
        if (k < (long) Math.pow(2, n - 1)) {
            return GapDoi(n - 1, k);
        }
        if (k > (long) Math.pow(2, n - 1)) {
            return GapDoi(n - 1, k - (long) Math.pow(2, n - 1));
        }
        return n;
    }
}

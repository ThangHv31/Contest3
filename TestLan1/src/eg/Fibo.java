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
public class Fibo {

    static long fibo[] = new long[93];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Fibonaci(93);
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fibo[n]);
        }
    }

    private static void Fibonaci(int x) {
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i < x; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }
}

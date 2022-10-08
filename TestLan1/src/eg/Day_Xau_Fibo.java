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
public class Day_Xau_Fibo {

    static long arr[] = new long[93];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Fibo();
        while (t-- > 0) {
            int n = sc.nextInt();
            long index = sc.nextLong();
            System.out.println(DXFibo(n, index));
        }
    }

    public static String DXFibo(int n, long index) {
        if (n == 1) {
            return "A";
        }
        if (n == 2) {
            return "B";
        }
        if (index > arr[n - 2]) {
            return DXFibo(n - 1, index - arr[n - 2]);
        }
        return DXFibo(n - 2, index);
    }

    public static void Fibo() {
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < 93; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonma
 */
public class Phan_Tu_Ben_Phai_First_Lon_Hon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            xuly(a, n);
        }
    }

    private static void xuly(int[] a, int n) {
        int res[] = new int[n], i;
        Stack<Integer> st = new Stack<>();
        for (i = n - 1; i >= 0; i--) {
            while (!st.empty() && a[i] >= st.peek()) {
                st.pop();
            }
            if (!st.empty()) {
                res[i] = st.peek();
            } else {
                res[i] = -1;
            }
            st.push(a[i]);
        }
        for (i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}

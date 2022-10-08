package test1_1;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[1000];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            TreeSet<Integer> chan = new TreeSet<>();
            TreeSet<Integer> le = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    chan.add(a[i]);
                } else {
                    le.add(a[i]);
                }
            }
            for (Integer x : chan) {
                System.out.print(x + " ");
            }
            System.out.println();
            Stack<Integer> st = new Stack<>();
            for (Integer x : le) {
                st.push(x);
            }
            while (!st.isEmpty()) {
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
    }
}

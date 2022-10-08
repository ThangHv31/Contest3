/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonma
 */
public class Duong_Di_Theo_DFS {

    static int n, m, x;
    static ArrayList<Integer> listke[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int duongdi[] = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            x = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
                duongdi[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
                listke[v].add(u);
            }
            DFS(x);
            for (int i = 1; i <= n; i++) {
                if (i != x) {
                    if (!check[i]) {
                        System.out.println("No path");
                    } else {
                        Stack<Integer> st = new Stack<>();
                        st.push(i);
                        while (st.peek() != x) {
                            st.push(duongdi[st.peek()]);
                        }
                        while (!st.isEmpty()) {
                            System.out.print(st.pop() + " ");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }

    public static void DFS(int u) {
        check[u] = true;
        for (Integer v : listke[u]) {
            if (!check[v]) {
                duongdi[v] = u;
                DFS(v);
            }
        }
    }
}

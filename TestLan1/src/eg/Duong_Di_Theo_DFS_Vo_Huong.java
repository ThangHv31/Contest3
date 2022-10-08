/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonma
 */
public class Duong_Di_Theo_DFS_Vo_Huong {

    static List<Integer> listke[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int duongdi[] = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
                listke[v].add(u);
            }
            DFS(x);
            if (!check[y]) {
                System.out.print("-1");
            } else {
                Stack<Integer> st = new Stack<>();
                st.push(y);
                while (st.peek() != x) {
                    st.push(duongdi[st.peek()]);
                }
                while (!st.empty()) {
                    if (st.size() != 1) {
                        System.out.print(st.peek() + " ");
                    } else {
                        System.out.print(st.peek());
                    }
                    st.pop();
                }
            }
            System.out.println("");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.*;

/**
 *
 * @author sonma
 */
public class Duong_Di_Co_Huong {

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
            }
            BFS(x);
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
                        System.out.print(st.peek() + " -> ");
                    } else {
                        System.out.print(st.peek());
                    }
                    st.pop();
                }
            }
            System.out.println();
        }
    }

    public static void BFS(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        check[u] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer i : listke[v]) {
                if (!check[i]) {
                    duongdi[i] = v;
                    check[i] = true;
                    q.add(i);
                }
            }
        }
    }
}

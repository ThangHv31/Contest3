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
public class Duong_Di_Theo_BFS {
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
            BFS(x);
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

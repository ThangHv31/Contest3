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
public class Dinh_That {

    static int n, m, x, y;
    static List<Integer> listke[] = new ArrayList[105];
    static boolean check[] = new boolean[105];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
            }
            int dem = 0;
            for (int i = 1; i <= n; i++) {
                dem += Result(i);
            }
            System.out.println(dem);
        }
    }

    public static int Result(int u) {
        for (int i = 0; i <= n; i++) {
            check[i] = false;
        }
        check[u] = true;
        BFS(x);
        if (!check[y]) {
            return 1;
        } else {
            return 0;
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
                    check[i] = true;
                    q.add(i);
                }
            }
        }
    }
}

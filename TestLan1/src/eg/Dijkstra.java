/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Dijkstra {

    static int n, m, x;
    static long MAXX = 100000l;
    static long d[] = new long[100005];
    static PriorityQueue<Long> q = new PriorityQueue<Long>();
    static boolean check[] = new boolean[100005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            x = sc.nextInt();
            ArrayList<ArrayList<Long>> list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<Long>());
                check[i] = false;
                d[i] = (int) 1e9;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int c = sc.nextInt();

                list.get(u).add(1L * (c * MAXX + v));
                list.get(v).add(1L * (c * MAXX + u));
            }
            d[x] = 0;
            check[x] = true;
            for (long x : list.get(x)) {
                q.add(x);
                d[(int) (x % MAXX)] = x / MAXX;

            }
            while (!q.isEmpty()) {
                long tmp = q.remove();
                int u = (int) (tmp % MAXX);
                long value1 = tmp / MAXX;
                if (check[u] && value1 != d[u]) {
                    continue;
                }
                check[u] = true;
                for (long x : list.get(u)) {
                    int v = (int) (x % MAXX);
                    if (check[v]) {
                        continue;
                    }
                    long value2 = x / MAXX;
                    if (d[v] > value1 + value2) {
                        d[v] = value1 + value2;
                        q.add(1l * (MAXX * d[v] + v));
                    }
                }
            }
            for (int i = 1; i <= n; i++) {
                if (i == x) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(d[i] + " ");
                }
            }
            System.out.println();
        }
    }
}

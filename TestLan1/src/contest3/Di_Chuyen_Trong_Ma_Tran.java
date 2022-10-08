/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.*;

/**
 *
 * @author sonma
 */
public class Di_Chuyen_Trong_Ma_Tran {

    static int n, m, a[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            a = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println(check());
        }
    }

    public static int check() {
        Queue<Pair<Pair<Integer, Integer>, Integer>> q = new LinkedList<>();
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        q.add(new Pair<>(new Pair<>(1, 1), 0));
        set.add(new Pair<>(1, 1));
        while (!q.isEmpty()) {
            Pair<Pair<Integer, Integer>, Integer> x = q.poll();
            if (x.getKey().getKey() == n && x.getKey().getValue() == m) {
                return x.getValue();
            }
            int x1 = x.getKey().getKey();
            int y1 = x.getKey().getValue() + a[x.getKey().getKey()][x.getKey().getValue()];
            int x2 = x.getKey().getKey() + a[x.getKey().getKey()][x.getKey().getValue()];
            int y2 = x.getKey().getValue();
            if (x1 <= n && y1 <= m && !set.contains(new Pair(x1, y1))) {
                q.add(new Pair<>(new Pair<>(x1, y1), x.getValue() + 1));
                set.add(new Pair<>(x1, y1));
            }
            if (x2 <= n && y2 <= m && !set.contains(new Pair(x2, y2))) {
                q.add(new Pair<>(new Pair<>(x2, y2), x.getValue() + 1));
                set.add(new Pair<>(x2, y2));
            }
        }
        return -1;
    }

    public static class Pair<U, V> {

        private U key;
        private V value;

        public Pair(U u, V v) {
            this.key = u;
            this.value = v;
        }

        public U getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

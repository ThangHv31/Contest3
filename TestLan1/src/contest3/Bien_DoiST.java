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
public class Bien_DoiST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), s = sc.nextInt();
            if (a >= s) {
                System.out.println(a - s);
            } else {
                System.out.println(check(a, s));
            }
        }
    }

    public static int check(int a, int s) {
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(new Pair<>(a, 0));
        set.add(a);
        while (!q.isEmpty()) {
            Pair<Integer, Integer> x = q.poll();
            if (x.getKey() == s) {
                return x.getValue();
            }
            if (x.getKey() - 1 > 0 && !set.contains(x.getKey() - 1)) {
                q.add(new Pair<>(x.getKey() - 1, x.getValue() + 1));
                set.add(x.getKey() - 1);
            }
            if (x.getKey() < s && !set.contains(x.getKey() * 2)) {
                q.add(new Pair<>(x.getKey() * 2, x.getValue() + 1));
                set.add(x.getKey() * 2);
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

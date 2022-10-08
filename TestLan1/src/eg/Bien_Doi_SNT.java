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
public class Bien_Doi_SNT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int s = sc.nextInt();
            System.out.println(Result(a, s));
        }
    }

    public static int Result(int a, int s) {
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(new Pair<>(a, 0));
        set.add(a);
        while (!q.isEmpty()) {
            Pair<Integer, Integer> x = q.poll();
            if (x.getKey() == s) {
                return x.getValue();
            }
            String str = x.getKey() + "";
            for (int i = 0; i < 4; i++) {
                String str1 = "";
                if (i > 0) {
                    str1 = str.substring(0, i);
                }
                String str3 = "";
                if (i <= 3) {
                    str3 = str.substring(i + 1);
                }
                for (int j = 9; j >= 0; j--) {
//                        System.out.println(str1 + j + str3);
                    int check = Integer.parseInt(str1 + j + str3);
                    if (check >= 1000 && check <= 9999 && checkSNTo(check)) {
                        if (!set.contains(check)) {
//                                System.out.println(check);
                            q.add(new Pair<>(check, x.getValue() + 1));
                            set.add(check);
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static boolean checkSNTo(int x) {
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
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

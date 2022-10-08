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
public class Giao_Cua_Hai_Day_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            set2.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<Integer>(set2);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < set2.size(); i++) {
            if (set1.contains(list.get(i))) {
                res.add(list.get(i));
            }
        }
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}

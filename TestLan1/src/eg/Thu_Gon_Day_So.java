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
public class Thu_Gon_Day_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Deque<Integer> res = new ArrayDeque<>();
        res.offerLast(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            if (!res.isEmpty()) {
                if ((list.get(i) + res.peekLast()) % 2 == 0) {
                    res.pollLast();
                } else {
                    res.offerLast(list.get(i));
                }
            } else {
                res.offerLast(list.get(i));
            }
        }
        System.out.println(res.size());
    }
}

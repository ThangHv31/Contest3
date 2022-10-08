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
public class Hop_Cua_Hai_Day_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < n + m; i++) {
            set1.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<>(set1);
        Collections.sort(list);
        list.forEach((i) -> {
            System.out.print(i + " ");
        });
    }
}

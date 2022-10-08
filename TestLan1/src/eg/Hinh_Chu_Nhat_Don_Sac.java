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
public class Hinh_Chu_Nhat_Don_Sac {

    static Queue<Integer> q[] = new PriorityQueue[1000005];
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < q.length; i++) {
            q[i] = new PriorityQueue<>(5, (a, b) -> a - b);
        }
        int x = sc.nextInt(), y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            q[sc.nextInt()].add(i);
            list.add(i);
        }
        long maxx = 0;
        for (int i = 0; i < list.size(); i++) {
//            if()
        }
    }

}

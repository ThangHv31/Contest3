/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Bieu_Dien_Do_Thi_Co_Huong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            Queue<Integer> list[] = new PriorityQueue[v + 1];
            for (int i = 1; i <= v; i++) {
                list[i] = new PriorityQueue();
            }
            while (e-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list[x].add(y);
            }
            for (int i = 1; i < list.length; i++) {
                System.out.print(i + ":");
                while (!list[i].isEmpty()) {
                    System.out.print(" " + list[i].poll());
                }
                System.out.println("");
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Noi_Day {

    static Queue<Long> q = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long res = 0;
            int n = sc.nextInt();
            q.clear();
            while (n-- > 0) {
                q.add(sc.nextLong());
            }
            while (!q.isEmpty()) {
                long t1 = (q.poll()) % 1000000007;
                long t2 = (q.poll()) % 1000000007;
                long x = (t1 + t2) % 1000000007;
                res = (res + x) % 1000000007;
                if (q.isEmpty()) {
                    System.out.println(res);
                    break;
                }
                q.add(x);
            }
        }
    }
}

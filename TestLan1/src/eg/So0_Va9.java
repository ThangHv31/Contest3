/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class So0_Va9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add(9L);
            long sum = 0;
            while (true) {
                sum = q.poll();
                if (sum % x == 0) {
                    break;
                } else {
                    q.add(sum * 10);
                    q.add(sum * 10 + 9);
                }
            }
            System.out.println(sum);
        }
    }
}

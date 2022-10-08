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
public class So_Nhi_Phan_1DenN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String end = Integer.toBinaryString(n);
            Queue<String> q = new LinkedList<>();
            q.add("1");
            while (!q.peek().equals(end)) {
                String s = q.poll();
                System.out.print(s + " ");
                q.add(s + "0");
                q.add(s + "1");
            }
            System.out.println(q.poll());
        }
    }
}

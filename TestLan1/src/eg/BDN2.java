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
public class BDN2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("1");
            while (true) {
                String s = q.poll();
                Long p = Long.parseLong(s);
                if (p % n == 0) {
                    System.out.println(s);
                    break;
                }
                q.add(s + "0");
                q.add(s + "1");
            }
        }
    }
}

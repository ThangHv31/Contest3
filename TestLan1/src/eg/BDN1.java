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
public class BDN1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            Queue<String> q = new LinkedList<>();
            q.add("1");
            int res = 0;
            while (!q.isEmpty()) {
                String s2 = q.poll();
                if (s2.length() < s1.length()) {
                    res++;
                    q.add(s2 + "0");
                    q.add(s2 + "1");
                }
                if (s2.length() == s1.length() && s2.compareTo(s1) <= 0) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}

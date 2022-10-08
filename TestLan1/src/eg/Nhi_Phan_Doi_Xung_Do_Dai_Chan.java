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
public class Nhi_Phan_Doi_Xung_Do_Dai_Chan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("0");
            q.add("1");
            while (q.peek().length() * 2 <= n) {
                String s = q.poll();
                StringBuilder s1 = new StringBuilder(s);
                s1 = s1.reverse();
                System.out.print(s + s1 + " ");
                q.add(s + "0");
                q.add(s + "1");
            }
            System.out.println("");
        }
    }
}

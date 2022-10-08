/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class So_Loc_Phat_DX_Chan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            int dem = 0;
            while (dem < n) {
                dem++;
                String s = q.poll();
                StringBuilder s1 = new StringBuilder(s);
                s1 = s1.reverse();
                System.out.print(s + s1 + " ");
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println("");
        }
    }
}

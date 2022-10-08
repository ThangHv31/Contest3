/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class So_Loc_Phat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            ArrayList<String> list = new ArrayList<>();
            q.add("6");
            q.add("8");
            while (true) {
                String s = q.poll();
                if (s.length() > n) {
                    break;
                }
                list.add(s);
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println(list.size());
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}

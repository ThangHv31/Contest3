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
public class So2_Uu_The {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("1");
            q.add("2");
            int dem = 0;
            while (dem < n) {
                String s = q.poll();
                if (check(s)) {
                    dem++;
                    System.out.print(s + " ");
                }
                q.add(s + "0");
                q.add(s + "1");
                q.add(s + "2");
            }
            System.out.println("");
        }
    }

    public static boolean check(String s) {
        int arr[] = new int[3];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }
        if (arr[2] - (arr[1] + arr[0]) > 0) {
            return true;
        }
        return false;
    }
}

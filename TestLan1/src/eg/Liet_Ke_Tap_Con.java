/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Liet_Ke_Tap_Con {

    static int n = 0, b[] = new int[30];
    static String s = "";
    static ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            res = new ArrayList<>();
            n = sc.nextInt();
            s = sc.next();
            Try(1);
            Collections.sort(res);
            for (String s : res) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

    private static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) {
                Result();
            } else {
                Try(i + 1);
            }
        }
    }

    private static void Result() {
        String x = "";
        for (int i = 1; i <= n; i++) {
            if (b[i] == 1) {
                x += s.charAt(i - 1);
            }
        }
        res.add(x);
    }
}

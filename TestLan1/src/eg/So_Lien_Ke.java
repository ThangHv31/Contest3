/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class So_Lien_Ke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }

    public static String check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) - s.charAt(i + 1)) != -1 && (s.charAt(i) - s.charAt(i + 1)) != 1) {
                return "NO";
            }
        }
        return "YES";
    }
}

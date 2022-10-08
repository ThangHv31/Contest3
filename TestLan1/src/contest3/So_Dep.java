/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class So_Dep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            StringBuilder s1 = new StringBuilder();
            s1.append(s);
            if (check(s) == true && s.equals(s1.reverse().toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean check(String s) {
        for (int i = 0; i <= s.length() / 2 + 1; i++) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

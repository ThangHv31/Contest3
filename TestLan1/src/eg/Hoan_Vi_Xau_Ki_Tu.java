/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Hoan_Vi_Xau_Ki_Tu {

    static String s;
    static int l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        l = s.length();
        HoanVi();
    }

    public static void HoanVi() {
        List<Character> list = new ArrayList<>();
        while (!check()) {
            for (int i = l - 1; i > 0; i--) {
                if (s.charAt(i) > s.charAt(i - 1)) {
                    list.add(s.charAt(i - 1));
                    Character x = s.charAt(i);
                    s = s.substring(0, i - 1);
                    s += x;
                    Collections.sort(list);
                    for (Character y : list) {
                        s += y;
                    }
                    System.out.println(s);
                    list.clear();
                    break;
                } else {
                    list.add(s.charAt(i));
                }
            }
        }
    }

    public static boolean check() {
        for (int i = 0; i < l - 1; i++) {
            if (s.charAt(i) < s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonma
 */
public class Sua_Lai_Day_Ngoac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }

    private static int check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.empty()) {
                st.push(s.charAt(i));
            } else {
                char c = st.peek();
                if (c == '(' && s.charAt(i) == ')') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }

        }

        int dem1 = 0, dem2 = 0;
        while (!st.empty()) {
            char c = st.pop();
            if (c == '(') {
                dem1++;
            } else {
                dem2++;
            }
        }
        return dem1 / 2 + dem2 / 2 + dem1 % 2 + dem2 % 2;
    }
}

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
public class Kiem_Tra_Cau_Viet_Dung_Quy_Tac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (xuly(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean xuly(String s) {
        Stack<Character> st = new Stack<>();
        st.push(' ');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            } else if (st.peek() == '[' && s.charAt(i) == ']') {
                st.pop();
            } else if (s.charAt(i) == ']' || s.charAt(i) == ')') {
                return false;
            }
        }
        if (st.size() == 1) {
            return true;
        }
        return false;
    }
}

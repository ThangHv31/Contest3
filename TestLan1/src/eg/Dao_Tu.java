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
public class Dao_Tu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    while (!st.empty()) {
                        System.out.print(st.peek());
                        st.pop();
                    }
                    System.out.print(" ");
                } else {
                    st.push(s.charAt(i));
                }
            }
            while (!st.empty()) {
                System.out.print(st.peek());
                st.pop();
            }
            System.out.println("");
        }
    }
}

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
public class Bieu_Thuc_Dung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (st.empty()) {
                    st.push(s.charAt(i));
                } else if (st.peek() == '[' && s.charAt(i) == ']') {
                    st.pop();
                } else if (st.peek() == ']' && s.charAt(i) == '[') {
                    res += st.size();
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
            System.out.println(res);
        }
    }
}

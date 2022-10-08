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
public class Dau_Ngoac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            Stack<Integer> st1 = new Stack<>();
            int dem = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    dem++;
                    System.out.print(dem + " ");
                    st.push('(');
                    st1.push(dem);
                } else if (st.peek() == '(' && s.charAt(i) == ')') {
                    System.out.print(st1.pop() + " ");
                }
            }
            System.out.println("");
        }
    }
}

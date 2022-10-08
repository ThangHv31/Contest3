/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonma
 */
public class Loai_Bo_Dau_Ngoac_Thua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Character> q = new Stack<>();
            Stack<Character> q1 = new Stack<>();
            q.add(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    if (s.charAt(i) != ')') {
                        q.push(s.charAt(i));
                    } else {
                        q1.push(')');
                        while (q.peek() != '(') {
                            q1.push(q.pop());
                        }
                        q1.push(q.pop());
//                        while(!q.isEmpty()){
//                            q1.push(q.pop());
//                        }
                    }
                }
            }
            while (!q1.isEmpty()) {
                System.out.print(q1.pop());
            }
        }
    }
}

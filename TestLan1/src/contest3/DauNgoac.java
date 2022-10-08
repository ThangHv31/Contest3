package contest3;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoac {
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

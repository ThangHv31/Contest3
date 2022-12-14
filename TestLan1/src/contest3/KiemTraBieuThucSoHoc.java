package contest3;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThucSoHoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while(t-- > 0) {
            String s = in.nextLine();
            if (btSoHoc(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    public static boolean btSoHoc(String s) {
        Stack<Integer> st = new Stack();

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                int j = (Integer)st.peek();
                st.pop();
                if (i - j == 2) {
                    return true;
                }

                if (s.charAt(j + 1) == '(' && s.charAt(i - 1) == ')') {
                    return true;
                }
            }
        }

        return false;
    }
}

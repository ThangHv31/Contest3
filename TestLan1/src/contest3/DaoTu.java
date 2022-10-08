package contest3;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {
    public DaoTu() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0) {
            String s = in.nextLine();
            xuly(s);
        }

    }

    public static void xuly(String s) {
        Stack<Character> st = new Stack();
        Scanner in = new Scanner(s);

        while(in.hasNext()) {
            String tmp = in.next();

            for(int i = 0; i < tmp.length(); ++i) {
                if (tmp.charAt(i) != ' ') {
                    st.push(tmp.charAt(i));
                } else {
                    while(!st.empty()) {
                        System.out.print(st.peek());
                        st.pop();
                    }
                }
            }

            while(!st.empty()) {
                System.out.print(st.peek());
                st.pop();
            }

            System.out.print(" ");
        }

        System.out.println();
    }
}

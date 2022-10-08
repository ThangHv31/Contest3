package contest3;

import java.util.Scanner;
import java.util.Stack;

public class NgoacChungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while(t-- > 0) {
            String s = in.nextLine();
            System.out.println(tinh(s));
        }

    }

    public static int tinh(String s) {
        Stack<Integer> st = new Stack();
        int kq = 0;
        st.push(-1);

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (!st.empty()) {
                    kq = Math.max(kq, i - (Integer)st.peek());
                } else {
                    st.push(i);
                }
            }
        }

        return kq;
    }
}

package contest3;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());

        while(t-- > 0) {
            String s = in.nextLine();
            if (dayNgoacDung(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean dayNgoacDung(String s) {
        Stack<Character> st = new Stack();

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '(' && s.charAt(i) != '{' && s.charAt(i) != '[') {
                if (st.empty()) {
                    return false;
                }

                char in = (Character)st.peek();
                char out = s.charAt(i);
                if (in == '(' && out == ')') {
                    st.pop();
                } else if (in == '[' && out == ']') {
                    st.pop();
                } else {
                    if (in != '{' || out != '}') {
                        return false;
                    }

                    st.pop();
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        return true;
    }
}

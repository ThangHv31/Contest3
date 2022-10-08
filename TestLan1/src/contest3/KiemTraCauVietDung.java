package contest3;


import java.util.Scanner;
import java.util.Stack;

public class KiemTraCauVietDung {
    public KiemTraCauVietDung() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            String s = in.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean check(String s) {
        Stack<Character> st = new Stack();
        if (s.charAt(s.length() - 1) != '.') {
            return false;
        } else {
            for(int i = 0; i < s.length() - 1; ++i) {
                if (s.charAt(i) != '(' && s.charAt(i) != '{') {
                    if ((s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i) < 'A' || s.charAt(i) > 'Z') && s.charAt(i) != ' ') {
                        if (st.empty()) {
                            return false;
                        }

                        char in = (Character)st.peek();
                        char out = s.charAt(i);
                        if (in == '(' && out == ')') {
                            st.pop();
                        } else {
                            if (in != '[' || out != ']') {
                                return false;
                            }

                            st.pop();
                        }
                    } else {
                        st.push(s.charAt(i));
                    }
                } else {
                    st.push(s.charAt(i));
                }
            }

            return true;
        }
    }
}

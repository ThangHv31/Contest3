package contest3;

import java.util.Scanner;
import java.util.Stack;

public class SooNgoacVuongMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ngoacVuongMax(s);
    }

    private static void ngoacVuongMax(String s) {
        Stack<Character> stack = new Stack();
        int res = 0;

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '(' && s.charAt(i) != '[') {
                if (stack.isEmpty()) {
                    res = 0;
                }

                char in = (Character)stack.peek();
                char out = s.charAt(i);
                if (in == '(' && out == ')') {
                    stack.pop();
                } else if (in == '[' && out == ']') {
                    stack.pop();
                    ++res;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        System.out.println(res);
    }

}

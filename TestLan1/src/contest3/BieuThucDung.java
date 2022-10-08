package contest3;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucDung {
    static Stack<Character> s = new Stack();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String s = scanner.nextLine();
            bieuThucDung(s);
        }

    }

    public static void bieuThucDung(String s) {
        int count = 0;
        int delete = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (BieuThucDung.s.size() == 0) {
                delete = 0;
                BieuThucDung.s.push(s.charAt(i));
            } else {
                Character _s = (Character) BieuThucDung.s.peek();
                if (_s == '[' && s.charAt(i) == ']') {
                    BieuThucDung.s.pop();
                    delete += 2;
                } else if (_s == ']' && s.charAt(i) == '[') {
                    count = count + BieuThucDung.s.size() + delete;
                    BieuThucDung.s.pop();
                } else {
                    BieuThucDung.s.push(s.charAt(i));
                }
            }
        }

        while (BieuThucDung.s.size() > 0) {
            BieuThucDung.s.pop();
        }

        System.out.println(count);
    }
}

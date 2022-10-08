package contest3;

import java.util.Scanner;
import java.util.Stack;

public class SoThuTuDauNgoac {
    static int[] indexes = new int[100005];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while(t-- > 0) {
            String eq = in.nextLine();
            xuLy(eq);
        }

    }

    private static void xuLy(String eq) {
        Stack<Integer> stack = new Stack();
        int index = 1;

        int i;
        for(i = 0; i < eq.length(); ++i) {
            if (eq.charAt(i) == '(') {
                stack.push(i);
                indexes[i] = index++;
            } else if (eq.charAt(i) == ')') {
                int j = (Integer)stack.peek();
                indexes[j] = indexes[i];
                stack.pop();
            }
        }

        for(i = 0; i < eq.length(); ++i) {
            if (indexes[i] > 0) {
                System.out.print(indexes[i] + " ");
            }
        }

        System.out.println();
    }
}

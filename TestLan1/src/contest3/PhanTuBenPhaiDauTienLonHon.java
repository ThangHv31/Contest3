package contest3;

import java.util.Scanner;
import java.util.Stack;

public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }

            run(a, n);
        }

    }

    public static void run(int[] a, int n) {
        Stack<Integer> stack = new Stack();
        int[] r = new int[n];

        int i;
        for (i = n - 1; i >= 0; --i) {
            while (!stack.isEmpty() && a[i] >= (Integer) stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                r[i] = -1;
            } else {
                r[i] = (Integer) stack.peek();
            }

            stack.push(a[i]);
        }

        for (i = 0; i < n; ++i) {
            System.out.print(r[i] + " ");
        }

        System.out.println();
    }
}


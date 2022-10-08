package contest3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhan1N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0) {
            int n = in.nextInt();
            soNhiPhan(n);
        }

    }

    private static void soNhiPhan(int n) {
        Queue<String> q = new LinkedList();
        q.add("1");

        while(n-- > 0) {
            String out = (String)q.peek();
            System.out.print(out);
            q.poll();
            q.add(out + "0");
            q.add(out + "1");
            System.out.print(" ");
        }

        System.out.println();
    }
}

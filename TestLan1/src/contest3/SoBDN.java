package contest3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoBDN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            isBDN(n);
        }
    }

    private static void isBDN(long n) {
        Queue<Long> q = new LinkedList<>();
        q.add((long) 1);
        int dem = 0;
        while (q.size() > 0) {
            long x = (Long) q.peek();
            if (x > n) break;
            q.poll();
            dem++;
            q.add(x * 10);
            q.add(x * 10 + 1);
        }
        System.out.println(dem);
    }
}

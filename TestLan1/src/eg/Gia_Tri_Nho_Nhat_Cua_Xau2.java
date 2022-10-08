/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Gia_Tri_Nho_Nhat_Cua_Xau2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            long k = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            long[] arr = new long[256];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)]++;
            }
            PriorityQueue<Long> st = new PriorityQueue<>((x, y) -> Long.compare(y, x));
            for (int i = 0; i < 256; i++) {
                if (arr[i] != 0) {
                    st.add(arr[i]);
                }
            }
            while (k > 0) {
                k--;
                long x = st.poll() - 1;
                st.add(x);
            }
            BigInteger res = new BigInteger("0", 10);
            while (!st.isEmpty()) {
                res = res.add(new BigInteger(st.peek().toString(), 10).multiply(new BigInteger(st.poll().toString(), 10)));
            }
            System.out.println(res);
        }
    }
}

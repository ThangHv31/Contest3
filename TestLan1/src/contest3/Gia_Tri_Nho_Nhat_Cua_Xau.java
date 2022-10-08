/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Gia_Tri_Nho_Nhat_Cua_Xau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int k = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            int[] arr = new int[256];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i)]++;
            }
            PriorityQueue<Integer> st = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
            for (int i = 0; i < 256; i++) {
                if (arr[i] != 0) {
                    st.add(arr[i]);
                }
            }
            while (k > 0) {
                k--;
                int x = st.poll() - 1;
                st.add(x);
            }
            long res = 0;
            while (!st.isEmpty()) {
                res += st.peek() * st.poll();
            }
            System.out.println(res);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sonma
 */
public class Cay_Khung_DFS {

    static int n, m;
    static ArrayList<Integer> listke[] = new ArrayList[1001];
    static boolean check[] = new boolean[1001];
    static int[] duongdi = new int[1001];
    static Stack<Integer> dsLuu;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            dsLuu = new Stack<>();
            Stack<String> dsLuu2 = new Stack<>();
            n = sc.nextInt();
            m = sc.nextInt();
            int s = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
                duongdi[i] = 0;
            }
            for (int j = 1; j <= m; j++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
                listke[v].add(u);
            }
            DFS(s);
            int z = 0;
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    z = 1;
                    break;
                }
            }

            if (z == 1) {
                System.out.println("-1");
            } else {
                while (dsLuu.size() > 1) {
                    String tmp = "";
                    tmp = tmp + duongdi[dsLuu.peek()] + " " + dsLuu.pop();
                    dsLuu2.add(tmp);
                }
                while (!dsLuu2.empty()) {
                    System.out.println(dsLuu2.pop());
                }

            }
        }
    }

    private static void DFS(int u) {
        check[u] = true;
        dsLuu.add(u);
        for (Integer v : listke[u]) {
            if (!check[v]) {
                duongdi[v] = u;
                DFS(v);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Kiem_Tra_Chu_Trinh {

    static List<Integer> listke[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static int trc[] = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
                listke[v].add(u);
            }
            int x = 0;
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    if (DFS(i).equals("YES")) {
                        x = 1;
                        System.out.println("YES");
                        break;
                    }
                }
            }
            if (x == 0) {
                System.out.println("NO");
            }
        }
    }

    public static String DFS(int u) {
        check[u] = true;
        for (Integer v : listke[u]) {
            if (!check[v]) {
                trc[v] = u;
                DFS(v);
            } else if (check[v] && trc[u] != v) {
                return "YES";
            }
        }
        return "NO";
    }
}

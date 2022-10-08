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
public class Kiem_Tra_Lien_Thong_Manh {

    static int n, m;
    static List<Integer> listke[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
            }
            System.out.println(Result());
        }
    }

    public static String Result() {
        for (int i = 0; i <= n; i++) {
            check[i] = false;
        }
        for (int i = 1; i <= n; i++) {
            DFS(i);
            for (int j = 1; j <= n; j++) {
                if (!check[j]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void DFS(int u) {
        check[u] = true;
        for (Integer v : listke[u]) {
            if (!check[v]) {
                DFS(v);
            }
        }
    }
}

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
public class Dem_So_TP_Lien_Thong {

    static List<Integer> listke[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int dem = 0;
            for (int i = 0; i < 1005; i++) {
                listke[i] = new ArrayList<>();
                check[i] = false;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                listke[u].add(v);
                listke[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    DFS(i);
                    dem++;
                }
            }
            System.out.println(dem);
        }
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

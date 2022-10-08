/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Diem_Nut_Giao_Thong_Trong_Yeu {

    static int n, m, res;
    static List<Integer> listke[] = new ArrayList[1005];
    static boolean check[] = new boolean[1005];
    static List<Integer> listtru;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            listtru = new ArrayList<>();
            n = sc.nextInt();
            m = sc.nextInt();
            res = 0;
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
            for (int i = 1; i <= n; i++) {
                if (!check[i]) {
                    DFS(i);
                    res++;
                }
            }
            for (int i = 1; i <= n; i++) {
                Result(i);
            }
            System.out.println(listtru.size());
            for (Integer x : listtru) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }

    public static void Result(int i) {
        for (int j = 0; j <= n; j++) {
            check[j] = false;
        }
        check[i] = true;
        int dem = 0;
        for (int j = 1; j <= n; j++) {
            if (!check[j]) {
                DFS(j);
                dem++;
            }
        }
        if (dem != res) {
            listtru.add(i);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class So_Buoc_Di_Chuyen_It_Nhat {

    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            Queue<int[]> q = new LinkedList<>();
            int arr[] = new int[2];
            arr[0] = 1;
            arr[1] = 1;
            q.add(arr);
            int dem = 0;
//            while (true) {
                dem++;
//                if (check(q)) {
//                    break;
//                }
                int arrx[] = q.peek();
                int arry[] = q.peek();
                int arrz[] = q.poll();
                arrx[0] = arrx[0] + 1;
                q.add(arrx);
                arry[1] = arry[1] + 1;
                q.add(arry);
                arrz[0] = arrz[0] + 1;
                arrz[1] = arrz[1] + 1;
                q.add(arrz);
//            }
            while(!q.isEmpty()){
                System.out.println(q.peek()[0]+" "+q.poll()[1]);
            }
//            int res = 0;
//            while (dem > 0) {
//                res += dem - Math.pow(3, res);
//                res++;
//            }
//            System.out.println(res - 1);
        }
    }

    public static boolean check(Queue<int[]> arra) {
        int arrb[] = arra.peek();
        if (arrb[0] == n && arrb[1] == m) {
            return true;
        }
        return false;
    }
}

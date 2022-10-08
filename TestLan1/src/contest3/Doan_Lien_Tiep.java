/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Doan_Lien_Tiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<int[]> q = new PriorityQueue<>();
            int[] arr = new int[n];
            int[][] maxx = new int[1000005][n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int x[] = new int[2];
//            q.add();
            System.out.println(1);
        }
    }
}

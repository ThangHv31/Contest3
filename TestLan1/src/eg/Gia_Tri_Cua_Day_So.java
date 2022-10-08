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
public class Gia_Tri_Cua_Day_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(arr[0]);
        int sum = 0;
        while (true) {
            int j = 0;
            for (int i = j; i < n; i++) {
                
            }
        }
    }
}

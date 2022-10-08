/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Chuyen_DS_Ke_Sang_DS_Canh {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int check[][] = new int[t + 1][t + 1];
        for (int i = 1; i <= t; i++) {
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                int x = Integer.parseInt(arr[j]);
                if (check[i][x] == 0 && check[x][i] == 0) {
                    System.out.println(i + " " + x);
                    check[i][x] = 1;
                    check[x][i] = 1;
                }
            }
        }
    }
}

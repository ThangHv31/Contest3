/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;

import static java.lang.Integer.max;

/**
 *
 * @author sonma
 */
public class Xau_Con_Chung_Dai_Nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int arr[][] = new int[1005][1005];
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        arr[i + 1][j + 1] = arr[i][j] + 1;
                    } else {
                        arr[i + 1][j + 1] = max(arr[i][j + 1], arr[i + 1][j]);
                    }
                }
            }
            System.out.println(arr[s1.length()][s2.length()]);
        }
    }
}

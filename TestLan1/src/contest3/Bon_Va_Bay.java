/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest3;

import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Bon_Va_Bay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '4') || (s.charAt(i) == '7')) {
                dem++;
            }
        }
        if (dem == 4 || dem == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

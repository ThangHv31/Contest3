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
public class Nham_Chu_So {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String resa1 = "";
        String resb1 = "";
        String resa2 = "";
        String resb2 = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '6') {
                resa1 += a.charAt(i);
            } else {
                resa1 += '5';
            }
            if (a.charAt(i) != '5') {
                resa2 += a.charAt(i);
            } else {
                resa2 += '6';
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) != '6') {
                resb1 += b.charAt(i);
            } else {
                resb1 += '5';
            }
            if (b.charAt(i) != '5') {
                resb2 += b.charAt(i);
            } else {
                resb2 += '6';
            }
        }
        int x1 = Integer.parseInt(resa1);
        int y1 = Integer.parseInt(resb1);
        int x2 = Integer.parseInt(resa2);
        int y2 = Integer.parseInt(resb2);
        System.out.println((x1+y1) + " " + (x2+y2));
    }
}

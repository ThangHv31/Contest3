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
public class Chuan_Hoa_Hoten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] name = s.split(" ");
            String s1 = "";
            for (int i = 0; i < name.length; i++) {
                if (name[i].length() > 0) {
                    String x = name[i].toLowerCase();
                    char u = name[i].toUpperCase().charAt(0);
                    s1 += u + x.substring(1) + " ";
                }
            }
            System.out.println(s1);
        }
    }
}

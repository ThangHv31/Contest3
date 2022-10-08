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
public class Bieu_Thuc_Dung2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            int l = s.length();
            int dem = 0, maxx = 0;
            boolean check = false;
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) == '(') {
                    dem++;
                    if (dem > maxx) {
                        maxx = dem;
                    }
                } else if (s.charAt(i) == ')') {
                    if (dem > 0) {
                        dem--;
                    } else {
                        System.out.println("-1");
                        check = true;
                        break;
                    }
                }
            }
            if (!check) {
                if (dem != 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(maxx);
                }
            }
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> mem = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] name = s.split(" ");
            String res = "";
            res += name[name.length - 1];
            for (int i = 0; i < name.length - 1; i++) {
                if (name[i].length() > 0) {
                    res += name[i].charAt(0);
                }
            }
            int dem = 1;
            for (int i = 0; i < mem.size(); i++) {
                if (res.equals(mem.get(i))) {
                    dem++;
                }
            }
            mem.add(res);
            if (dem != 1) {
                res += "" + dem;
            }
            System.out.println(res + "@ptit.edu.vn");
        }
    }
}

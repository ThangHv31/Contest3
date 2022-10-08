/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Mang_Doi_Xung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            ArrayList listA = new ArrayList<>();
            ArrayList listB = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                listA.add(x);
                listB.add(x);
            }
            Collections.reverse(listB);
            if(listA.equals(listB)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

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
public class Nhi_Phan_Ke_Tiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String s = sc.nextLine();
            String res = "";
            int n = s.length();
            int i;
            for (i = n-1; i >= 0; i--) {
                if(s.charAt(i) == '0'){
                    res += '1';
                    break;
                } else {
                    res += '0';
                }
            }
            if(i > 0){
                sb1.append(s.substring(0, i));
                res += sb1.reverse().toString();
            }
            sb2.append(res);
            System.out.println(sb2.reverse());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Tong_Cac_CS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            int i = 0;
            long sum = 0;
//            boolean check = false;
            while (i < chars.length && chars[i] - '0' >= 0 && chars[i] - '0' <= 9) {
//                if (chars[i] - '0' == 0) {
//                    check = true;
//                }
                sum += chars[i] - '0';
                i++;
            }
            s = String.valueOf(chars);
            s = s.substring(0, 0) + s.substring(i) + sum;
//            if (sum != 0 || (sum == 0 && check ==  true)) {
//                System.out.println(s + sum);
//            } else {
                System.out.println(s);
//            }
        }
    }
}

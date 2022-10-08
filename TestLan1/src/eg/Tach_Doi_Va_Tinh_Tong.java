/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Tach_Doi_Va_Tinh_Tong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        do {
            int n = num.length() / 2;
            BigInteger x1 = new BigInteger(num.substring(0, n), 10);
            BigInteger x2 = new BigInteger(num.substring(n), 10);
            num = "" + (x1.add(x2));
            System.out.println(num);
        } while (num.length() > 1);
    }
}

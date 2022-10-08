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
public class Chia_Het {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = "0";
            BigInteger a1 = new BigInteger(s1, 10);
            BigInteger a2 = new BigInteger(s2, 10);
            BigInteger a3 = new BigInteger(s3, 10);
            BigInteger res1 = a1.mod(a2);
            BigInteger res2 = a2.mod(a1);
            if (res1.compareTo(a3) == 0 || res2.compareTo(a3) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

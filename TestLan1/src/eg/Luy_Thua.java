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
public class Luy_Thua {

    static int e = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0){
                return;
            } else {
                System.out.println(Pow(a, b));
            }
        }
    }

    public static long Pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        long temp = Pow(a, b / 2);
        temp = temp % e;
        if (b % 2 == 0) {
            return (temp * temp) % e;
        } else {
            return (((temp * temp) % e) * a) % e;
        }
    }
}

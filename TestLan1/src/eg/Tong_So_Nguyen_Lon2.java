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
public class Tong_So_Nguyen_Lon2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine(), 10);
        BigInteger b = new BigInteger(sc.nextLine(), 10);
        System.out.println(a.add(b));
    }
}

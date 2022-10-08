/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 *
 * @author sonma
 */
public class HPTN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int j = 0; j < x; j++){
            boolean check = true;
            int n = sc.nextInt();
            switch (n) {
                case 0:
                case 1:
                    System.out.println("NO");
                    check = false;
                    break;
                case 2:
                    System.out.println("YES");
                    check = false;
                    break;
                default:
                    for(int i = 2; i<=sqrt(n);i++){
                        if(n%i==0){
                            System.out.println("NO");
                            check = false;
                            break;
                        }
                    }   break;
            }
            if(check != false){
                System.out.println("YES");
            }
        }
    }
}

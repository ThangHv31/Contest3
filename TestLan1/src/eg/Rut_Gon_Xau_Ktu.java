/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author sonma
 */
public class Rut_Gon_Xau_Ktu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<Character> res = new ArrayDeque<>();
        res.offerLast(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++){
            if(!res.isEmpty()){
                if(s.charAt(i) == res.peekLast()){
                    res.pollLast();
                } else {
                    res.offerLast(s.charAt(i));
                }
            } else {
                res.offerLast(s.charAt(i));
            }
        }
        if(res.isEmpty()){
            System.out.println("Empty String");
        } else {
            while(res.size()>0){
                System.out.print(res.peekFirst());
                res.pollFirst();
            }
        }
    }
}

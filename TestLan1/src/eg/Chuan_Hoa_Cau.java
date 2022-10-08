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
public class Chuan_Hoa_Cau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = 4;
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            System.out.println(ChuanHoa(s));
        }
    }

    public static String ChuanHoa(String s) {
        String spl[] = s.split(" ");
        Deque<String> list = new ArrayDeque<>();
        String res = "";
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > 0) {
                if (i == 0 || (i > 0 && (list.peekLast().charAt(list.peekLast().length() - 1) == '.' || list.peekLast().charAt(list.peekLast().length() - 1) == '!' || list.peekLast().charAt(list.peekLast().length() - 1) == '?'))) {
                    String x = Character.toUpperCase(spl[i].charAt(0)) + spl[i].substring(1);
                    list.offerLast(x);
                } else {
                    list.offerLast(spl[i]);
                }
            }
        }
        res += list.peekFirst();
        list.pollFirst();
        while (!list.isEmpty()) {
            if (list.peekFirst().length() != 1) {
                res += " ";
            }
            res += list.peekFirst();
            list.pollFirst();
        }
        if (res.charAt(res.length() - 1) != '.' && res.charAt(res.length() - 1) != '!' && res.charAt(res.length() - 1) != '?') {
            res += ".";
        }
        return res;
    }
}

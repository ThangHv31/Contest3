package test1_1;

import java.util.*;

public class Bai4 {
    static void chiaTu(String s, Vector<String> a) {
        String x = "";
        s = s.toLowerCase() + " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (x != "") {
                    a.add(x);
                    x = "";
                }
            } else {
                x += s.charAt(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        while (n-- > 0) {
            String s1 = String.valueOf(scanner.nextLine());
            scanner.nextLine();
            String s2 = String.valueOf(scanner.nextLine());
            Vector<String> v1 = new Vector<String>();
            Vector<String> v2 = new Vector<String>();
            Vector<String> v = new Vector<String>();
            chiaTu(s1, v1);
            chiaTu(s2, v2);
            Map<String, Integer> m = new HashMap<String, Integer>();
            for (int i = 0; i < v2.size(); i++)
                m.put(v2.get(i), 1);
            for (int i = 0; i < v1.size(); i++) {
                if (m.get(v1.get(i)) == null) {
                    v.add(v1.get(i));
                    m.put(v1.get(i), 1);
                }
            }
            Collections.sort(v);
            for (int i = 0; i < v.size(); i++)
                System.out.print(v.get(i) + " ");
            System.out.println();
        }
    }
}

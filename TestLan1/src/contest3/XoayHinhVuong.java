package contest3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class XoayHinhVuong {
    static char arr1[];
    static char arr2[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            arr1 = new char[6];
            arr2 = new char[6];
            Queue<String> q = new LinkedList<>();
            for (int i = 0; i < 6; i++) {
                arr1[i] = sc.next().charAt(0);
            }
            for (int i = 0; i < 6; i++) {
                arr2[i] = sc.next().charAt(0);
            }
            int dem = 0;
            q.add(convertString(arr1));
            while (true) {
                dem++;
                if (check(q)) {
                    break;
                }
                char arrx[] = new char[6];
                char arry[] = new char[6];
                arrx = q.peek().toCharArray();
                arry = q.poll().toCharArray();
                char tmp1 = arrx[0];
                arrx[0] = arrx[3];
                arrx[3] = arrx[4];
                arrx[4] = arrx[1];
                arrx[1] = tmp1;
                q.add(convertString(arrx));
                char tmp2 = arry[1];
                arry[1] = arry[4];
                arry[4] = arry[5];
                arry[5] = arry[2];
                arry[2] = tmp2;
                q.add(convertString(arry));
            }
            int res = 0;
            while (dem > 0) {
                dem = (int) (dem - Math.pow(2, res));
                res++;
            }
            System.out.println(res - 1);
        }
    }

    public static boolean check(Queue<String> q) {
        char arr[] = new char[6];
        arr = q.peek().toCharArray();
        for (int i = 0; i < 6; i++) {
            if (arr2[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static String convertString(char[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}

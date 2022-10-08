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
public class To_Hop_Tiep_Theo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] check = new int[n + 1];
            int dem = 0;
            for (int i = 0; i < k; i++) {
                arr[i] = sc.nextInt();
                check[arr[i]]++;
            }
            for (int i = k - 1; i >= 0; i--) {
                if (arr[i] != n - ((k - 1) - i)) {
                    arr[i]++;
                    if (check[arr[i]] == 0) {
                        dem++;
                    }
                    for (int j = i + 1; j < k; j++) {
                        arr[j] = arr[j - 1] + 1;
                        if (check[arr[j]] == 0) {
                            dem++;
                        }
                    }
                    break;
                }
            }
            if (dem != 0) {
                System.out.println(dem);
            } else {
                System.out.println(k);
            }
        }
    }
}

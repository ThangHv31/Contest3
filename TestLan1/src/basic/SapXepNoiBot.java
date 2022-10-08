package basic;

import java.util.Scanner;
public class SapXepNoiBot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, a[]  = new int[101];
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
            int dem = 0;
            for (int j = 1; j < n - i; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    dem++;
                }
            }
               if (dem == 0) {
                break;
            }
            System.out.print("Buoc " + (i + 1) + ":");
            for (int x = 0; x < n; x++) {
                System.out.print(" " + a[x]);
            }
            System.out.println("");
         
        
			
		}
	}

}

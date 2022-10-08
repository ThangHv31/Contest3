package basic;

import java.util.Scanner;

public class SapXepChon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, a[]  = new int[101];
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int min = a[i];
			int index = i;
			for(int j=i;j<n;j++) {
				if(min > a[j]) {
					min = a[j];
					index = j;
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
			System.out.print("Buoc " + (i+1) + ":");
			for(int j=0;j<n;j++) {
				System.out.print(" " + a[j]);
			}
			System.out.println();
			
		}
	}
}

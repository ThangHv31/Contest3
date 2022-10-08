package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SapXepChen {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, a[]  = new int[101];
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(a[i]);
			Collections.sort(list);
			System.out.print("Buoc " + i + ":");
			for(int j : list)
			{
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}

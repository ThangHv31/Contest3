package basic;

import java.util.Set;
import java.util.TreeSet;

public class HopHaiDaySo {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Set<Integer> set = new TreeSet<>();
		int n = scanner.nextInt(), m = scanner.nextInt(), a[] = new int[n], b[] = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
			set.add(a[i]);
		}
		for (int i = 0; i < m; i++) {
			b[i] = scanner.nextInt();
			set.add(b[i]);
		}
		for (Integer i : set){
			System.out.printf(i + " ");
		}
	}
}

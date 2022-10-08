package contest3;

import java.util.Scanner;
import java.util.Stack;

public class HinhChuNhat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while (t-->0) {
			int n = in.nextInt(), a[] = new int[n];
			for (int i=0; i<n; i++) a[i] = in.nextInt();
			solve(a, n);
		}
	}

	public static void solve(int a[], int n) {
		int right[] = new int[n], left[] = new int[n], i, j;
		long square[] = new long[n];
		Stack<Integer> st = new Stack<>();
		for (i = n-1; i>=0; i--) {
			while (!st.empty() && a[i] >= st.peek()) st.pop();
			if (!st.empty()) right[i] = st.peek();
			else right[i] = -1;
			st.push(a[i]);
		}
		st.clear();
		for (i = 0; i<n; i++) {
			System.out.print(right[i] + " ");
		}
		System.out.println();
	}
}

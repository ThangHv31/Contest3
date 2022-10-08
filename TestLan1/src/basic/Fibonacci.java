package basic;

import java.util.Scanner;

public class Fibonacci {
	static int modulo = (int) (1e9+7);
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int n;
		while(t-->0) {
			n = scanner.nextInt();
			System.out.println(fiboCheck(n));
		}
	}
	public static long fiboCheck(int n) {
		long fibo[] = new long[n+2];
		int i;
		fibo[0] = 0;
		fibo[1] = 1;
		for (i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[n];
	}
}

package basic;

public class MangDoiXung {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		int n;
		long a[] = new long[100];
		while(t-->0) {
			n = inScanner.nextInt();
			for (int i = 1; i<=n; i++) {
				a[i] = inScanner.nextLong();
			}
			if (doixung(n, a)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean doixung(int n, long a[]) {
			for (int i = 1; i<=n; i++) {
				if (a[i] != a[n-i+1]) {
					return false;
				}
			}
			return true;
	}
}

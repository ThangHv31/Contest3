package basic;

public class HoanViKeTiep {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		int n, a[] = new int[1001];
		while (t-- > 0) {
			n = inScanner.nextInt();
			for (int i = 1; i <= n; i++) {
				a[i] = inScanner.nextInt();
			}
			generate(n, a);
		}
	}

	public static void generate(int n, int a[]) {
		int i = n-1;
		while (i > 0 && a[i] > a[i + 1])
			i--;
		if (i <= 0) {
			for (int i1 = 1; i1 <= n; i1++) {
				System.out.print(i1 + " ");
			}
			System.out.println();
		} else {
			int k = n;
			while (a[k] < a[i])
				k--;
			
			int tmp = a[k];
			a[k] = a[i];
			a[i] = tmp;
			
			int l = i + 1, r = n;
			while (l < r) {
				
				int tmp1 = a[l];
				a[l] = a[r];
				a[r] = tmp1;
				
				l++;
				r--;
			}
			for (int i1 = 1; i1 <= n; i1++)
				System.out.print(a[i1] + " ");
			System.out.println();
		}
	}

	
}

package basic;

public class SoNguyenTo {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		
		while(t-->0) {
			long n = inScanner.nextLong();
			if(isPrime(n))
				System.out.println("YES");
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean isPrime(long n) {
		if (n < 2) {
			return false;
		}
		for(long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
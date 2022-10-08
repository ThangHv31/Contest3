package basic;

import java.util.Scanner;

public class TongGiaiThua {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long s = 0;
		for(int i=1;i<=n;i++)
		{
			s += giaithua(i);
			
		}
		System.out.println(s);
	}
	
	public static long giaithua(int n)
	{
		long t = 1;
		for(int i = 1; i<=n;i++)
		{
			t *= i;
		}
		return t;
	}
}

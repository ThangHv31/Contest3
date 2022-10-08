package basic;


import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTen {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while(t-- > 0)
		{
			System.out.println(chuanhoa(in.nextLine()));
		}
	}
	
	public static String chuanhoa(String s)
	{
		StringTokenizer str = new StringTokenizer(s);
		String chuanhoa = "";		
		while(str.hasMoreTokens())
		{
			String tu1 = str.nextToken();
			String vietthuong = tu1.toLowerCase();
			String viethoa = tu1.toUpperCase();
			chuanhoa = chuanhoa + viethoa.charAt(0) + vietthuong.substring(1, vietthuong.length()) + " ";
		}
		return chuanhoa.trim();
	}

}

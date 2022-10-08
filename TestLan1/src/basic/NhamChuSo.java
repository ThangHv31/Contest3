package basic;

import java.util.Scanner;
public class NhamChuSo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();
		System.out.print(minConvert(a) + minConvert(b) + " ");
		System.out.print(maxConvert(a) + maxConvert(b));
		
	}
	public static int minConvert(int c)
	{
		String s = "";
		s+= c;
		String moi = "";
		for(int i=0; i<s.length();i++)
		{
			if(Integer.parseInt(""+s.charAt(i)) == 6) {
				moi += 5;
			}
			else {
				moi += s.charAt(i);
			}
			
		}
		return Integer.parseInt(moi);
	}
	
	public static int maxConvert(int c)
	{
		String s = "";
		s+= c;
		String moi = "";
		for(int i=0; i<s.length();i++)
		{
			if(Integer.parseInt(""+s.charAt(i)) == 5) {
				moi += 6;
			}
			else {
				moi += s.charAt(i);
			}			
		}
		return Integer.parseInt(moi);
	}
	
}

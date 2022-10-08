package basic;

public class XauNhiPhanKeTiep {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		inScanner.nextLine();
		String s;
		while (t-- > 0) {
			s = inScanner.nextLine();
			generate(s);
		}
	}

	public static void generate(String s) {
		char[] c = s.toCharArray();
		int i = c.length;
		while( c[i] == '1' && i>=0) i--;
		if (i<0) {
			for (int i1=0; i1<c.length; i1++)
				System.out.print("0");
			System.out.println();
		}
		else {
			c[i] = '1';
			for(int j = i+1; j<c.length; j++)
				c[j] = '0';
		}
		
		java.util.stream.Stream.of(c).forEach(System.out::print);
	}
}

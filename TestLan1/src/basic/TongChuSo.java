package basic;

public class TongChuSo {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		inScanner.nextLine();
		String n;
		while(t-->0) {
			n = inScanner.nextLine();
			handleString(n);
		}
	}
	
	public static String sortString(String inputString) {
		
		char tmp[] = inputString.toCharArray();
		
		java.util.Arrays.sort(tmp);
		
		return new String(tmp);
	}
	
	public static void handleString (String input) {
		int sum = 0;
		input = sortString(input);
		String letter = input.replaceAll("[^A-Za-z]", "");
		for (int i=0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i)))
				sum += Character.getNumericValue(input.charAt(i));
		}
		System.out.println(letter+sum);
	}
}

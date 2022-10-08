package basic;

public class RutGonXau {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		String s = inScanner.nextLine();

		s = deleteChar(s, 0);
		System.out.println(s);
	}

	public static String deleteChar(String input, int index) {
		StringBuilder str = new StringBuilder(input);
		str.deleteCharAt(index);
		return str.toString();
	}

	static String removeUtil(String str, char last_removed) {

		// If length of string is 1 or 0
		if (str.length() == 0 || str.length() == 1)
			return str;

		// Remove leftmost same characters and recur for remaining string
		if (str.charAt(0) == str.charAt(1)) {
			last_removed = str.charAt(0);
			while (str.length() > 1 && str.charAt(0) == str.charAt(1))
				str = str.substring(1, str.length());
			str = str.substring(1, str.length());
			return removeUtil(str, last_removed);
		}

		String rem_str = removeUtil(str.substring(1, str.length()), last_removed);

		if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) {
			last_removed = str.charAt(0);

		// Remove first character
			return rem_str.substring(1, rem_str.length());
		}

		if (rem_str.length() == 0 && last_removed == str.charAt(0))
			return rem_str;
		return (str.charAt(0) + rem_str);
	}

}

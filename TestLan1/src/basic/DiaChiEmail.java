package basic;

import java.util.*;

public class DiaChiEmail {
	static Map<String, Integer> map = new HashMap<String, Integer>();		
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		
		while(t-- > 0)
		{
			System.out.println(email(in.nextLine()));
		}
	}
	
	public static String email(String s)
	{
		StringTokenizer str = new StringTokenizer(s);
		String email = "";	
		List<String> ds = new ArrayList<String>();
		
		while(str.hasMoreTokens())
		{
			ds.add(str.nextToken());			
		}
		email = email + ds.get(ds.size()-1).toLowerCase(); 
		for(int i=0;i<ds.size()-1;i++)
		{
			email = email + ds.get(i).toLowerCase().charAt(0);
		}
		
		if(map.containsKey(email))
		{
			int value = map.get(email)+1;
			map.put(email, value);
			email = email + value + "@ptit.edu.vn";
		}
		else
		{
			map.put(email, 1);
			email = email + "@ptit.edu.vn";
		}		
		return email.trim();
	}
}

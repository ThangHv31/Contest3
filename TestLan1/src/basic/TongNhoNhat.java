package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TongNhoNhat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<Integer> ds = new ArrayList<Integer>();
		while(t-->0)
		{
			int n = in.nextInt();
			for(int i=1;i<=n;i++)
			{
				ds.add(in.nextInt());				
			}
			System.out.println(tongnhonhat(ds));
			ds.clear();
		}
	}
	
	public static long tongnhonhat(List<Integer> ds)
	{
		Collections.sort(ds);
		String sothunhat = "";
		String sothuhai = "";
		int check = 0;
		for(Integer i : ds)
		{
			if(check%2==0)
			{
				sothunhat = sothunhat + i;
			}
			else
			{
				sothuhai = sothuhai + i;
			}
			check++;
		}
		long tong = 0;
		if(!sothunhat.equals("") && !sothuhai.equals(""))
		{
			 tong = Long.parseLong(sothunhat) + Long.parseLong(sothuhai);
		}
		else if(sothunhat.equals(""))
		{
			tong = Long.parseLong(sothuhai);
		}
		else if(sothuhai.equals(""))
		{
			tong = Long.parseLong(sothunhat);
		}	
 		return tong;
	}
}

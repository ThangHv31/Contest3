package hdt.dssinhvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner in = new java.util.Scanner(System.in);
		ArrayList<sinhvien> dsArrayList = new ArrayList<>();
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=n; i++) {
			sinhvien sv = new sinhvien();
			sv.input(in);
			dsArrayList.add(sv);
		}
		for (sinhvien sv: dsArrayList)
			System.out.println(sv);
	}
}

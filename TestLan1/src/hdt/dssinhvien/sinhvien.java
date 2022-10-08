package hdt.dssinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class sinhvien {
	private String ma, ten, lop;
	private Date dob;
	private float gpa;

	public sinhvien input(Scanner scanner) throws ParseException {
		return new sinhvien(scanner.nextLine(),scanner.nextLine(),new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine()),scanner.nextFloat());
	}

	public sinhvien(String ten, String lop, Date dob, float gpa) {
		this.ten = ten;
		this.lop = lop;
		this.dob = dob;
		this.gpa = gpa;
	}

	public sinhvien() {
	}

	public sinhvien(int id, String ten, String lop, String dob, float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", id);
		this.ten = ten;
		this.lop = lop;
		this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " 
				+ new SimpleDateFormat("dd/MM/yyyy").format(dob)+ " "
				+ String.format("%.2f", gpa);
	}
	
	
}

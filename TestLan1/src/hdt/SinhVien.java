package hdt;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String ma = "B20DCCN001";
    private String lop;
    private String dob;
    private Float gpa;



    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public SinhVien() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien();
        sinhVien.setHoTen(scanner.nextLine());
        sinhVien.setLop(scanner.nextLine());
        sinhVien.setDob(scanner.nextLine());
        sinhVien.setGpa(scanner.nextFloat());
        System.out.printf(sinhVien.ma + " " + sinhVien.hoTen + " " + sinhVien.lop + " " + sinhVien.dob + " ");
        System.out.printf("%.2f", sinhVien.gpa);
    }

}

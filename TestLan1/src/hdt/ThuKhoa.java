package hdt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThuKhoa {
    private int id;
    private String ten;
    private String dob;
    private Float diem1;
    private Float diem2;
    private Float diem3;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Float getDiem1() {
        return diem1;
    }

    public void setDiem1(Float diem1) {
        this.diem1 = diem1;
    }

    public Float getDiem2() {
        return diem2;
    }

    public void setDiem2(Float diem2) {
        this.diem2 = diem2;
    }

    public Float getDiem3() {
        return diem3;
    }

    public void setDiem3(Float diem3) {
        this.diem3 = diem3;
    }

    public ThuKhoa() {
    }

    public ThuKhoa(int id, String ten, String dob, Float diem1, Float diem2, Float diem3) {
        this.id = id;
        this.ten = ten;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public static void main(String[] args) {
        List<ThuKhoa> thuKhoaList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 1;
        for (int i = 0; i < n; i++) {
           ThuKhoa thuKhoa = new ThuKhoa();
            thuKhoa.setTen(sc.nextLine());
            thuKhoa.setDob(sc.nextLine());
            thuKhoa.setDiem1(Float.parseFloat(sc.nextLine()));
            thuKhoa.setDiem2(Float.parseFloat(sc.nextLine()));
            thuKhoa.setDiem3(Float.parseFloat(sc.nextLine()));
            thuKhoa.setId(id);
            id++;
        }
    }
}

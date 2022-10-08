package contest2;

import java.util.Scanner;

class ThiSinh{
    private String hoTen,ngaySinh;
    private float diemMon1,diemMon2,diemMon3;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, float diemMon1, float diemMon2, float diemMon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(float diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public float getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(float diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public float getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(float diemMon3) {
        this.diemMon3 = diemMon3;
    }
}

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ThiSinh thiSinh=new ThiSinh();
        thiSinh.setHoTen(scanner.nextLine());
        thiSinh.setNgaySinh(scanner.nextLine());
        thiSinh.setDiemMon1(scanner.nextFloat());
        thiSinh.setDiemMon2(scanner.nextFloat());
        thiSinh.setDiemMon3(scanner.nextFloat());
        System.out.println(thiSinh.getHoTen()+" "+thiSinh.getNgaySinh()+" "+(thiSinh.getDiemMon1()+ thiSinh.getDiemMon2()+ thiSinh.getDiemMon3()));
    }
}

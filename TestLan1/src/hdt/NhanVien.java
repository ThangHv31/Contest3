package hdt;

import java.util.Scanner;

public class NhanVien {
    static Scanner sc = new Scanner(System.in);
    private String ma;
    private String ten;
    private Double luongCoBan;
    private Double ngayCong;

    static String getMaPhong(String maNv) {
        return maNv.substring(3, 5);
    }

    static String getTenPhong(String maNv, String[] phongs) {
        for (int i = 0; i < phongs.length; i++) {
            if (phongs[i].substring(0, 2).equals(getMaPhong(maNv))) {
                return phongs[i].substring(3);
            }
        }
        return null;
    }

    int heSo(String maNV) {
        String nhom = maNV.substring(0, 1);
        int soNam = Integer.parseInt(maNV.substring(1, 3));
        switch (nhom) {
            case "A": {
                switch (soNam) {
                    case 1:
                    case 2:
                    case 3: {
                        return 10;
                    }
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: {
                        return 12;
                    }
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15: {
                        return 14;
                    }
                    default:
                        return 20;
                }
            }
            case "B": {
                switch (soNam) {
                    case 1:
                    case 2:
                    case 3: {
                        return 10;
                    }
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: {
                        return 11;
                    }
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15: {
                        return 13;
                    }
                    default:
                        return 16;
                }
            }
            case "C": {
                switch (soNam) {
                    case 1:
                    case 2:
                    case 3: {
                        return 9;
                    }
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: {
                        return 10;
                    }
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15: {
                        return 12;
                    }
                    default:
                        return 14;
                }
            }
            case "D": {
                switch (soNam) {
                    case 1:
                    case 2:
                    case 3: {
                        return 8;
                    }
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8: {
                        return 9;
                    }
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15: {
                        return 11;
                    }
                    default:
                        return 13;
                }
            }
        }
        return 0;
    }

    public NhanVien(String ma, String ten, Double luongCoBan, Double ngayCong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        String listPhong[] = new String[n];
        for (int i = 0; i < n; i++) {
            listPhong[i] = sc.nextLine();
        }
        int soNv = sc.nextInt();
        while (soNv-- > 0) {
            NhanVien nhanVien = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            String tenPhong = getTenPhong(nhanVien.ma, listPhong);
            double luong = nhanVien.luongCoBan * nhanVien.ngayCong * nhanVien.heSo(nhanVien.ma);
            System.out.println(nhanVien.ma + " " + nhanVien.ten + " " + tenPhong + " " + luong);
        }
    }
}

package sapxepmanv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<NhanVien> nvList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String ma = scanner.nextLine();
            String ten = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            nvList.add(new NhanVien(ma, ten, lop, email));
        }
        int k = scanner.nextInt();
        while (k-- > 0) {
            List<NhanVien> response = new ArrayList<>();
            String query = scanner.nextLine();
            switch (query.toLowerCase()) {
                case "ke toan": {
                    response = nvList.stream().filter(x -> x.getMa().contains("DCKT")).collect(Collectors.toList());
                    break;
                }
                case "cong nghe thong tin": {
                    response = nvList.stream().filter(x -> x.getMa().contains("DCCN") && x.getMa().charAt(0) == 'E').collect(Collectors.toList());
                    break;
                }
                case "an toan thong tin": {
                    response = nvList.stream().filter(x -> x.getMa().contains("DCAT") && x.getMa().charAt(0) == 'E').collect(Collectors.toList());
                    break;
                }
                case "vien thong": {
                    response = nvList.stream().filter(x -> x.getMa().contains("DCVT")).collect(Collectors.toList());
                    break;
                }
                case "dien tu": {
                    response = nvList.stream().filter(x -> x.getMa().contains("DCDT")).collect(Collectors.toList());
                    break;
                }
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + query.toUpperCase() + ":");
            for (NhanVien nv : response) {
                System.out.println(nv);
            }
        }
    }
}

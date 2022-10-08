package contest2;

import java.math.BigInteger;
import java.util.Scanner;

public class PhanSo {
    private BigInteger tu;
    private BigInteger mau;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhanSo phanSo= new PhanSo();
        phanSo.tu = scanner.nextBigInteger();
        phanSo.mau = scanner.nextBigInteger();
        System.out.println(phanSo.tu.divide(phanSo.tu.gcd(phanSo.mau))+ "/" +phanSo.mau.divide(phanSo.tu.gcd(phanSo.mau)));
    }
}

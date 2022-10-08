package contest2.point;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-->0){
            Points a = new Points(scanner);
            Points b = new Points(scanner);
            System.out.printf("%.4f", Points.distance(a,b));
        }
    }
}

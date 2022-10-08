package basic;

public class BC_UC {
    public static void main(String[] args) {
        java.util.Scanner inScanner = new java.util.Scanner(System.in);
        int t = inScanner.nextInt();

        while(t-->0) {
            long a = inScanner.nextLong(), b = inScanner.nextLong();
            System.out.println(BCNN(a,b) + " " + UCLN(a,b));
        }
    }

    public static long UCLN(long a, long b){
        if (a == 0) return b;
        return UCLN(b % a, a);
    }
    public static long BCNN(long a, long b){
        return (a * b) / UCLN(a, b);
    }
}

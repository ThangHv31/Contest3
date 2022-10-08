package contest2.point;

import java.util.Scanner;

public class Points {
    private Double x;
    private Double y;


    public Double distance(Points point2) {
        Double result = Math.sqrt((this.x - point2.x) * (this.x - point2.x) + (this.y - point2.y) * (this.y - point2.y));
        return Double.valueOf(Math.round(result * 10000) / 10000);
    }

    public static Double distance(Points point1, Points point2) {
        Double result = Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) + (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
        return result;
    }

    public Points(Scanner scanner) {
        this.x = scanner.nextDouble();
        this.y = scanner.nextDouble();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Points(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Points() {
    }
}

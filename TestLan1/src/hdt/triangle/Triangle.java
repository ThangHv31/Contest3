package hdt.triangle;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String str) {
        String s = str.trim();
        s = s.replaceAll(" ","");
        this.a = new Point(Double.parseDouble(s.substring(0, 1)), Double.parseDouble(s.substring(1, 2)));
        this.b = new Point(Double.parseDouble(s.substring(2, 3)), Double.parseDouble(s.substring(3, 4)));
        this.c = new Point(Double.parseDouble(s.substring(4, 5)), Double.parseDouble(s.substring(5, 6)));
    }

    double getPerimeter() {
        double chuVi = (Point.distance(this.a, this.b) + Point.distance(this.a, this.c) + Point.distance(this.b, this.c));
        double result = Math.round(chuVi * 1000);
        return result / 1000;
    }

    boolean valid() {
        return Point.distance(this.a, this.b) + Point.distance(this.a, this.c) > Point.distance(this.b, this.c)
                && Point.distance(this.a, this.b) + Point.distance(this.b, this.c) > Point.distance(this.a, this.c)
                && Point.distance(this.c, this.b) + Point.distance(this.a, this.c) > Point.distance(this.a, this.b);
    }
}

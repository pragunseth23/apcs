package shapes;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calcArea() {
        final double pi = 3.14;
        int sqradius = this.radius * this.radius;
        double area = sqradius * pi;
        return area;
    }

    public int compareTo(Shape o) {
        int diff = (int) (this.calcArea() - o.calcArea());
        return diff;
    }

}

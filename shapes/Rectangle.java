package shapes;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        double area = this.width * this.height;
        return area;
    }

    public int compareTo(Shape o) {
        int diff = (int) (this.calcArea() - o.calcArea());
        return diff;
    }
}
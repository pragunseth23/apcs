package shapes;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double calcArea() {
        double area = this.side * this.side;
        return area;
    }

    public int compareTo(Shape o) {
        int diff = (int) (this.calcArea() - o.calcArea());
        return diff;
    }

    public void setNum(int num) {
        super.setNum(num);
    }

    public int getNum() {
        return super.getNum();
    }
}
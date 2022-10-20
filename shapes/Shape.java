package shapes;

public abstract class Shape implements Comparable<Shape> {
    public abstract double calcArea();

    private int num = 3;

    public void setNum(int number) {
        num = number;
    }

    public int getNum() {
        return num;
    }
}
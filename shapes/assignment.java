package shapes;

public class assignment {
    public static void main(String[] args) {
        Shape c, c1, c2;
        c = new Square(2);
        c1 = new Circle(2);
        c2 = new Rectangle(2, 2);

        System.out.println(c.compareTo(c1));
        System.out.println(c.compareTo(c2));
        c.setNum(17);
        System.out.println(c.getNum());

    }
}

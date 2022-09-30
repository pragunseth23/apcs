package severalfunctions;

import java.util.*;

public class three {

    public static void main(String[] args) {
        Random rand = new Random();
        int cap = 20;
        Shape arr[] = new Shape[rand.nextInt(cap)];

        for (int i = 0; i < arr.length; i++) {
            Shape ok = new Shape();
            arr[i] = ok;
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getColor() == "red") {
                arr[i].toBlack();
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class Shape {
    Random rand = new Random();
    String[] typeArr = { "Cube", "Triangle", "Cone" };
    String[] colorArr = { "red", "green", "blue", "yellow", "orange" };
    int typeIndex = rand.nextInt(typeArr.length);
    private String type = typeArr[typeIndex];
    int colorIndex = rand.nextInt(colorArr.length);
    private String color = colorArr[colorIndex];

    public String getColor() {
        return this.color;
    }

    public void toBlack() {
        color = "black";
    }

    public String toString() {
        String answer = "[" + this.type + ", " + this.color + "]";
        return answer;
    }
}
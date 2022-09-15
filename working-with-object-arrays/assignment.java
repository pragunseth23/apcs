import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Car[] arr = new Car[7];
        Car tesla = new Car("Tesla");
        arr[0] = tesla;
        Car mercedes = new Car("Mercedes");
        arr[1] = mercedes;
        Car audi = new Car("Audi");
        arr[2] = audi;
        Car volvo = new Car("Volvo");
        arr[3] = volvo;
        Car honda = new Car("Honda");
        arr[4] = honda;
        Car ferrari = new Car("Ferrari");
        arr[5] = ferrari;
        Car bugatti = new Car("Bugatti");
        arr[6] = bugatti;
        System.out.println("Pre function:\n" + Arrays.toString(arr));

        functionx(arr);
        System.out.println("Post function:\n" + Arrays.toString(arr));
    }

    public static void functionx(Car[] x) {
        x = new Car[5];
        Car jeep = new Car("Jeep");
        x[0] = jeep;
        Car lambo = new Car("Lamborghini");
        x[1] = lambo;
        Car ford = new Car("Ford");
        x[2] = ford;
        Car hyundai = new Car("Hyundai");
        x[3] = hyundai;
        Car porsche = new Car("Porsche");
        x[4] = porsche;
        System.out.println("During function:\n" + Arrays.toString(x));
    }
}

class Car {
    String type;

    public Car(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
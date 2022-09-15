import java.util.*;

class Main {
    public static void main(String[] args) {
        Car[] arr = new Car[7];
        Car tesla = new Car("Tesla", 120000);
        arr[0] = tesla;
        Car mercedes = new Car("Mercedes", 150000);
        arr[1] = mercedes;
        Car audi = new Car("Audi", 70000);
        arr[2] = audi;
        Car volvo = new Car("Volvo", 50000);
        arr[3] = volvo;
        Car honda = new Car("Honda", 50000);
        arr[4] = honda;
        Car ferrari = new Car("Ferrari", 160000);
        arr[5] = ferrari;
        Car bugatti = new Car("Bugatti", 1800000);
        arr[6] = bugatti;
        System.out.println("Pre function:\n" + Arrays.toString(arr));

        functionx(arr);
        System.out.println("Post function:\n" + Arrays.toString(arr));

    }

    public static void functionx(Car[] x) {
        x[2].setCost(20);
        x[4].setCost(0);
        for (Car i : x) {
            System.out.println(i);
            /*
             * I am iterating through the function but the items are not being modified as I
             * am only printing each item and not modifying anything.
             */
        }
        Car rivian = new Car("Rivian", 50000);
        x[3] = rivian;
        x = new Car[5];
        Car jeep = new Car("Jeep", 50000);
        x[0] = jeep;
        Car lambo = new Car("Lamborghini", 100000);
        x[1] = lambo;
        Car ford = new Car("Ford", 20000);
        x[2] = ford;
        Car hyundai = new Car("Hyundai", 10000);
        x[3] = hyundai;
        Car porsche = new Car("Porsche", 100000);
        x[4] = porsche;
        System.out.println("During function:\n" + Arrays.toString(x));
    }
}

class Car {
    String brand;
    int cost;

    public Car(String brand, int cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString() {
        return brand + ": " + cost;
    }
}
/*
 * The value of arr[3] is changed to "Rivian" but the array is not reallocated
 * to Car[5]. The array in SPVM is changed but the new array only has a single
 * element changed and it has not been reallocated to a whole new array. This is
 * because function parameters are local.
 */
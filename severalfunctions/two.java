package severalfunctions;

import java.util.*;

public class two {

    public static void main(String[] args) {
        Random rand = new Random();
        int amt = 20;
        int arr[] = new int[rand.nextInt(amt)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(amt);
        }
        System.out.println(Arrays.toString(arr));
        changeNum(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void changeNum(int input[]) {
        Random rand = new Random();
        List<Integer> givenList = Arrays.asList(1, 2, 3);
        int randomElement = givenList.get(rand.nextInt(givenList.size()));
        System.out.println(randomElement);
        if (randomElement == 1) {
            for (int i = 0; i < input.length; i++) {
                input[i] = 999;
            }
        }
        if (randomElement == 2) {
            for (int i = 0; i < input.length; i = i + 2) {
                input[i] = 555;
            }
        }
        if (randomElement == 3) {
            for (int i = 0; i < input.length; i = i + 3) {
                input[i] = 444;
            }
        }

    }
}

package severalfunctions;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Random rand = new Random();
        int amt = 100;
        String arr[] = new String[rand.nextInt(amt)];
        for (int i = 0; i < arr.length; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            String value = Character.toString(c);
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            String test1 = arr[i];
            char test2 = test1.charAt(0);
            int test3 = test2;
            if (test3 >= 112) {
                arr[i] = "z";
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

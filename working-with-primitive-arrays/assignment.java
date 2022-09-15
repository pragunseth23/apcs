import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(arr));
        functionx(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void functionx(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] += 1;
        }
        /*
         * The elements were modified through the function as a new array was not
         * initialized and the array inputted into the function was directly edited.
         */
        x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }
    }
    /*
     * When the function ends, the array in SPVM has changed as when the same array
     * is printed after the function is called, the values are different.
     */
}
package binarysearch;

import java.util.Arrays;

public class assignment {

    // public static boolean find(int value, int[] vals) {

    // if (vals[vals.length/2] == value) {
    // return true;
    // }
    // return find(value, )
    // }

    public static boolean findWhile(int value, int[] vals) {
        int left = 0, right = vals.length - 1;
        int mid = vals.length / 2;
        while (left <= right) {
            System.out.println(mid);
            if (vals[mid] == value) {
                return true;
            } else if (vals[mid] < value) {
                left = mid + 1;
                mid = (left + right) / 2;

            } else if (vals[mid] > value) {
                right = mid;
                mid = (left + right) / 2;
            }
        }

        return false;
    }

    public static boolean findWhile(String value, String[] vals) {
        int left = 0, right = vals.length - 1;
        int mid = vals.length / 2;
        while (left <= right) {
            System.out.println(mid);
            if (vals[mid].equals(value)) {
                return true;
            } else if (vals[mid].compareTo(value) > 0) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else if (vals[mid].compareTo(value) < 0) {
                right = mid;
                mid = (left + right) / 2;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // int[] vals = {3, 7, 1, 9, 8, 3, 3, 5, };
        String[] vals = { "hello", "world", "bruh" };

        Arrays.sort(vals);
        System.out.println(Arrays.toString(vals));
        System.out.println(findWhile("bye", vals));

    }
}

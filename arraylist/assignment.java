package arraylist;

import java.util.*;

/*
 * Methods:
 * add()
 * Adds an element to the end of the "Array"
 * addTo()
 * Adds an element to an specified index in the "Array" such as the beginning, 0
 * remove()
 * Removes a specified element from the "Array"
 * length()
 * Returns the total length of the "Array"
 * logicalLength()
 * Returns the length of the "Array" in terms of the real elements in it
 * get()
 * Returns the element at a specified index in the "Array"
 * indexOf()
 * Returns the index of a specified element in the "Array"
 * toString()
 * Displays all of the elements in the "Array"
 * toLogicalString()
 * Displays all of the elements in the "Array" excluding null placeholder values
 */

class Main {
    public static void main(String[] args) {
        /*
         * Test 1
         */
        MyArrayList<String> arr = new MyArrayList<String>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("4");
        arr.remove("2");
        arr.addTo(6, "test");
        System.out.println(arr.indexOf("test"));
        System.out.println(arr.toString());
        System.out.println(arr.toLogicalString());
        /*
         * Test 2
         */
        MyArrayList<Integer> test = new MyArrayList<Integer>();
        test.add(23);
        System.out.println(test.indexOf(23));
        System.out.println(test.toLogicalString());
    }
}

/*
 * MyArrayList code
 */

class MyArrayList<E> {
    private Object[] list = new Object[2];
    private int size = 0;

    public void add(E data) {
        if (size >= list.length / 2) {
            increaseSize();
        }
        list[size++] = data;
    }

    public void addTo(int index, E data) {
        Object[] newList = new Object[list.length + 1];
        for (int i = 0, k = 0; i < newList.length; i++) {
            if (i == index) {
                newList[i] = data;
            }
            if (i != index) {
                newList[i] = list[k];
                k++;
            }
        }
        list = newList;
    }

    private void increaseSize() throws RuntimeException {
        list = Arrays.copyOf(list, list.length * 2);
    }

    public int length() {
        return list.length;
    }

    @SuppressWarnings("unchecked")
    public int logicalLength() {
        int len = 0;
        for (E i : (E[]) list) {
            if (i != null) {
                len++;
            }
        }
        return len;
    }

    public void remove(E data) {
        Object[] arr_new = new Object[list.length - 1];
        for (int i = 0, k = 0; i < list.length; i++) {
            if (list[i] != data) {
                arr_new[k] = list[i];
                k++;
            }
        }
        list = arr_new;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) throws RuntimeException {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return (E) list[index];
    }

    public int indexOf(E data) throws RuntimeException {
        int indexNum = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == data) {
                indexNum = i;
            }
        }
        if (indexNum == -1) {
            throw new IndexOutOfBoundsException();
        }
        return indexNum;
    }

    public String toString() {
        return Arrays.toString(list);
    }

    public String toLogicalString() {
        StringBuilder answer = new StringBuilder();
        answer.append("[");
        if (list[0] != null) {
            answer.append(list[0]);
        }
        for (int i = 1; i < list.length; i++) {
            if (list[i] != null) {
                answer.append(", " + list[i]);
            }
        }
        answer.append("]");
        return answer.toString();
    }
}
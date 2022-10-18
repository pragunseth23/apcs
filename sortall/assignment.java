package sortall;

class assignment {
    public static void main(String[] args) {
        Comparable[] letters = { "X", "Y", "Z", "A", "D", "C", "B", };

        SortAll.bubbleSort(letters);
        System.out.print("[");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + ", ");
        }
        System.out.println("]");
    }
}
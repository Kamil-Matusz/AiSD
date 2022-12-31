package BubbleSort;

public class BubbleSort_Int {
    private static int[] table = {7, 6, 2, 4, 5, -1, 0, -9, -123, -92};

    public static void main(String[] args) {
        bubbleSort();
        for (int elem : table) {System.out.print(elem+", ");
}
    }

    public static void bubbleSort() {
        for (int i = table.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = temp;
                }
            }
        }
    }
}

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;

                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;

            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {60, 20, 50, 7, 25, 70};

        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}

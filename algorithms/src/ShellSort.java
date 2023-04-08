import java.util.Arrays;

public class ShellSort {
    public static int[] shellSort(int[] arr) {
        int inner;
        int valueToInsert;
        int interval = 1;
        int i = 0;

        while (interval < arr.length / 3) {
            //Knuth's Formula
            interval = interval * 3 + 1;
        }

        while (interval > 0) {
            for (int outer = interval; outer < arr.length; outer++) {
                valueToInsert = arr[outer];
                inner = outer;
                while (inner > interval - 1 && arr[inner - interval] >= valueToInsert) {
                    arr[inner] = arr[inner - interval];
                    inner -= interval;
                }
                arr[inner] = valueToInsert;


            }
            interval = (interval - 1) / 3;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {20, 14, 19, 80, 31, 3, 120, 42, 26};
        System.out.println(Arrays.toString(shellSort(arr1)));
    }
}

import java.util.Arrays;


public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        int arrLen = arr.length;
        if (arrLen < 2) {
            return arr;

        }
        int midIndex = arrLen / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[arrLen - midIndex];
        for (int i = 0; i < midIndex; i++) {

            leftHalf[i] = arr[i];

        }
        for (int i = midIndex; i < arrLen; i++) {
            rightHalf[i - midIndex] = arr[i];

        }
        System.out.println(Arrays.toString(rightHalf));
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        System.out.println(Arrays.toString(rightHalf));
//        merge(arr, leftHalf, rightHalf);
        return arr;
    }

    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;

            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;

        }
        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;

        }

    }


    public static void main(String[] args) {
        int[] arr1 = {20, 14, 19, 80, 31, 3, 120, 42, 26};
        System.out.println(Arrays.toString(MergeSort.mergeSort(arr1)));


    }
}

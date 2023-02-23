import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        int[] arr = {12,8,4,6,0,3,5,2,7,9};
        System.out.println(Arrays.toString(bSort.bubbleSort(arr)));
    }

    public  int[] bubbleSort(int[] array){
        int size = array.length;
        int temp;
        for (int i=0; i<size; i++){
            boolean swapped = false;
            for (int j=0;j<size-1;j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;

                }else{
                    continue;
                }
            }
            if(!swapped){
                break;
            }
        }
        return array;

    }
}

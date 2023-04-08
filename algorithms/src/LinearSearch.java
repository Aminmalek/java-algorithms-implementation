public class LinearSearch {
    public  static int linearSearch(int[] array, int key) {
        for(int i=0; i<array.length; i++){
            if(array[i]==key) return i;
        }
    return 0;
    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 50, 70, 90};
        int key = 50;
        System.out.println(linearSearch(a1, key));
    }

}

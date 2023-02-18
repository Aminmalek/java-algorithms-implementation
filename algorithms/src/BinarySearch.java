public class BinarySearch {
    public static int binarySearch (int[] sortedArray,int key){
        int lowerBound = 1;
        int upperBound = sortedArray.length;
        int keyPosition;

        while (true){
            if (upperBound < lowerBound){
                System.out.println("x does not exists");
                break;
            }
            int midpoint = lowerBound + ( upperBound - lowerBound ) / 2;
            if (sortedArray[midpoint] < key) {
                lowerBound = midpoint + 1;
            }

            if (sortedArray[midpoint] > key) {
                lowerBound = midpoint - 1;
            }

            if (sortedArray[midpoint] == key) {
                keyPosition = midpoint;
                return keyPosition;
            }

        }
        return 0;

    }
    public static void main(String[] args) {
        int[] a1= {10,20,30,50,70,90};
        int key = 90;
        System.out.println(binarySearch( a1,key));
    }
}

public class InterpolationSearch {
    public static int interpolationSearch(int[] sortedArray, int key) {
        int lo = 0;
        int mid = -1;
        int hi = sortedArray.length - 1;

        while (true) {
            if (lo == hi || sortedArray[lo] == sortedArray[hi]) {
                System.out.println("key not found");
                break;
            }
            mid = lo + ((hi - lo) / (sortedArray[hi] - sortedArray[lo]) * (key - sortedArray[lo]));
            if (sortedArray[mid] == key) {
                return mid;
            } else {
                if (sortedArray[mid] < key) {
                    lo = mid + 1;
                } else if (sortedArray[mid] > key) {
                    hi = mid - 1;
                }

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50, 60};
        int key = 50;
        System.out.println(interpolationSearch(a1, key));
    }
}


package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 90, 108, 508, 1000 };
        int key = 1;
        int index = binarySearch(arr, key);
        System.out.println("Index of the key is :" + index);
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
}

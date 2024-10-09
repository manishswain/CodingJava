package Arrays;

import java.util.Arrays;

public class Reverse3 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 90, 108, 508, 1000 };

        int[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] reverseArray(int[] arr) {
        int start = 0, last = arr.length - 1;
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start++;
            last--;
        }
        return arr;
    }
}

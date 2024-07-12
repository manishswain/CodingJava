package Questions;

import java.util.*;

public class SimpleArray {

    // Complete the reverseArray function below.
    static void reverseArray(int[] a) {
        int n = a.length, temp = 0;
        for (int i = 0; i < (n + 1) / 2; i++) {
            temp = a[n - 1 - i];
            a[n - 1 - i] = a[i];
            a[i] = temp;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
    }
}

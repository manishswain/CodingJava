package Questions;

import java.util.*;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++)
                arr[i] = sc.nextInt();
            subarray(arr, sum);
        }
        sc.close();
    }

    static void subarray(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int checksum = 0;
            for (int j = i; j < arr.length; j++) {
                checksum += arr[j];
                if (checksum == sum) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
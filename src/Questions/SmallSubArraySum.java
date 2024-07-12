package Questions;

import java.util.*;

public class SmallSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int fsum = Integer.MAX_VALUE;
        int index = 0;
        for (int m = 0; m < t; m++) {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = sc.nextInt();
            }
            int j;
            for (int i = 0; i < n; i++) {
                int tsum = 0;
                for (j = i; j < n; j++) {
                    tsum += arr[j];
                }
                if (tsum > sum && tsum < fsum) {
                    fsum = tsum;
                    if (j - i < index)
                        index = j - i;
                }
            }
        }
        System.out.println(index);
        sc.close();
    }
}
package Test;

import java.util.*;

public class Solution26 {
    public static String check(int[] a,int n) {
    int cur = a[0];
    cur--;
    for (int i = 1; i < n; i++)
    {
        int nxt = a[i];
        if (nxt > cur)
            nxt--;
        else if (nxt < cur)
            return "No";

        cur = nxt;
    }
    return "Yes";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr,n));
    }
}
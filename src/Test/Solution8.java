package Test;

import java.util.*;
import java.util.stream.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of baskets");
            return;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0) {
                System.out.println("Invalid Input");
                return;
            }
        }
        IntStream st = Arrays.stream(arr);
        int counte = (int) st.filter(x -> x % 2 == 0).count();
        st = Arrays.stream(arr);
        int counto = (int) st.filter(x -> x % 2 != 0).count();
        if (counte == n)
            System.out.println("Even");
        else if (counto == n)
            System.out.println("Odd");
        else
            System.out.println("Reaarange the mangoes");

    }
}

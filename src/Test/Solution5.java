package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            flag = isPrime(arr[i]);
            if (flag)
                list.add(arr[i]);
        }
        Collections.sort(list);
        System.out.println(list.get(1));

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}

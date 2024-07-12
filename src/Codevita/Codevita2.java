package Codevita;

import java.util.Scanner;

public class Codevita2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = 1;
        int ind = 1;
        int count = 0;
        while (arr[pos] != 0) {
            count++;
            arr[pos] -= 1;
            pos = ((ind % n) + 1);
            ind = pos;
        }
        System.out.println(count);
    }

    static long maximumCoins(int N, int[] A) {
        int arr[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = A[i - 1];
        }
        int pos = 1;
        int ind = 1;
        long count = 0;
        while (arr[pos] != 0) {
            count++;
            arr[pos] -= 1;
            pos = ((ind % N) + 1);
            ind = pos;
        }
        return count;
    }
}

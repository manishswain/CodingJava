package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arrangments(n));
    }

    public static int arrangments(int input1) {
        if (input1 == 1)
            return 0;
        if (input1 == 2)
            return 1;
        return (input1 - 1) * (arrangments(input1 - 1) + arrangments(input1 - 2));
    }
}
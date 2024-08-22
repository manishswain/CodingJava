package Sigma.Practice;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseNum2(num));
        System.out.println(reverseNum(num));
        sc.close();
    }

    private static int reverseNum(int num) {
        boolean neg = false;
        if (num < 0) {
            neg = true;
            num = Math.abs(num);
        }
        if (num == 0) {
            return 0;
        }
        String reverseNum = "";
        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum + String.valueOf(digit);
            num = num / 10;
        }
        int finalReverse = 0;
        try {
            finalReverse = Integer.parseInt(reverseNum);
        } catch (NumberFormatException e) {
            return 0;
        }

        if (neg) {
            finalReverse = 0 - finalReverse;
        }
        return finalReverse;
    }

    private static int reverseNum2(int num) {
        String reversed = new StringBuilder().append(Math.abs(num)).reverse().toString();
        try {
            return (num < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

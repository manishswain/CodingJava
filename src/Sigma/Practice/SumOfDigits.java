package Practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfDigits(num);
        System.out.println(result);
        sc.close();
    }

    private static int sumOfDigits(int num) {
        int varSum = 0;
        while (num > 0) {
            varSum = varSum + num % 10;
            num /= 10;
        }
        return varSum;
    }
}

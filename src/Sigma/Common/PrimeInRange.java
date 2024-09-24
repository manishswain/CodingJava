package Sigma.Common;

import java.util.Scanner;

public class PrimeInRange {
    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for which you want to find Prime Numbers in the range");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

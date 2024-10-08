package Common;

import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or not");
        int n = sc.nextInt();
        boolean isPrime = checkPrime(n);
        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
        sc.close();
    }
}

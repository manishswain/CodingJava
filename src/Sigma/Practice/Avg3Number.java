package Sigma.Practice;

import java.util.Scanner;

public class Avg3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = (num1 + num2 + num3) / 3;
        System.out.println("Average of 3 numbers is: " + result);
        sc.close();
    }
}

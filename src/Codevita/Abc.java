package Codevita;

import java.util.Scanner;

public class Abc {
    public static void main(String args[]) {
        int num, start, end, i, rem, temp, counter = 0;
        Scanner sc = new Scanner(System.in);
        start = sc.nextInt();
        end = sc.nextInt();
        for (i = start + 1; i < end; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == num) {
                if (counter == 0) {
                    System.out.println("Armstrong Numbers Between the Given Interval are :");
                }
                System.out.print(i + "  ");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.print("Armstrong Number not Found between the given Interval.");
        }
    }
}
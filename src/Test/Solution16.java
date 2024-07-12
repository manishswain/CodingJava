package Test;

import java.util.*;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String s = sc.nextLine();
        double sal = 0;
        double disc = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (!Character.isLetter(s.charAt(i))) {
                System.out.println("Invalid Name");
                return;
            }
        }
        System.out.println("Enter the time duration");
        int n = sc.nextInt();
        int n1;
        if (n <= 0 || n > 24) {
            System.out.println("Invalid duration");
            return;
        }
        System.out.println("List of payment options");
        System.out.println("1)Visa card");
        System.out.println("2)Rupay card");
        System.out.println("3)Master card");
        System.out.println("Choose an option");
        while (true) {
            n1 = sc.nextInt();
            if (n1 < 0 || n1 > 3) {
                System.out.println("Try again");
            } else {
                break;
            }
        }
        if (n1 == 1) {
            if (n >= 5) {
                sal = 120 * n;
                disc = (sal * 0.25);
                sal = sal - disc;
            } else {
                sal = n * 120;
            }
        }
        if (n1 == 2) {
            if (n >= 5) {
                sal = 120 * n;
                disc = (sal * 0.17);
                sal = (120 * n) - disc;
            } else {
                sal = n * 120;
            }
        }
        if (n1 == 3) {
            sal = n * 120;
        }
        System.out.print("Dear " + s + " your bill amount is ");
        System.out.printf("%.2f", sal);
    }
}

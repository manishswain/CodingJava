package Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean result = checkPalidrome(num);
        String message = result ? "Palidrome" : "Not Palidrome";
        System.out.println(message);
        sc.close();
    }

    private static boolean checkPalidrome(int num) {
        String rev = "";
        int temp = num;
        while (num > 0) {
            rev = rev + num % 10;
            System.out.println(rev);
            num /= 10;
        }
        System.out.println(temp);
        try {
            return Integer.parseInt(rev) == temp;
        } catch (NumberFormatException e) {
            return true;
        }
    }
}

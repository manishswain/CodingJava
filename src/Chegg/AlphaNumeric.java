package Chegg;

import java.util.Scanner;

public class AlphaNumeric {
    public static void main(String[] args) {
        //Taking the input from string the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        char check = '\u0000';

        for (int i = 0; i < str.length(); i++) {
            check = str.charAt(i);
            //Checking the ascii values of each and every character of the String.
            if ((check < 48) || ((check > 57) && (check < 65) || ((check > 90) && (check < 97)) || (check > 122))) {
                System.out.println("The String is not alphanumeric as it contains -> " + check);
                System.exit(0);
            }
        }
        System.out.println("The String is alphanumeric");
        sc.close();
    }
}

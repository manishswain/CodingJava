package Codevita;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if (Long.parseLong(n)>1000000 ) {
            System.out.println("Wrong Input");
        } else {
            for (int i = 0; i < n.length(); i++) {
                int x = Math.abs((int) (n.charAt(i) - 48) - 9);
                System.out.print(x);
            }
        }
        sc.close();

    }
}

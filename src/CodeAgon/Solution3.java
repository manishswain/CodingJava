package CodeAgon;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of food in grams");
        double val = sc.nextDouble();
        if(val<500)
        {
            System.out.println("Invalid Input");
            return;
        }
        double kg = val/1000;
        double price = kg*250;
        System.out.printf("Total amount Rs %.2f",price);
        
    }
}

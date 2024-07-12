package Chegg;
import java.util.Scanner;

public class PowersOfRange {

    static int i = 0;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //Taking input from the user
        System.out.println("Enter Number:");
        int num = sc.nextInt();
        System.out.println("Enter the value of p");
        int p = sc.nextInt();
        System.out.println("Enter Minimum Value");
        int minValue = sc.nextInt();
        System.out.println("Enter Maximum Value");
        int maxValue = sc.nextInt();
        if (p > minValue)
            minValue = p;
        System.out.println("\n"+"Output");
        //Function Call
        printPowersOfRange(num, p, minValue, maxValue);
        sc.close();
    }
    //Recursive Funtion for printing the power of integer in the given range.
    private static void printPowersOfRange(int num, int p, int minValue, int maxValue) 
    {
        //Base Case
        if (Math.pow(num, i) > maxValue)
        {
            return;
        }
        if (Math.pow(num, i) > minValue)
            System.out.println((int) Math.pow(num, i));
        i++;
        //Recursive Call 
        printPowersOfRange(num, p, minValue, maxValue);
    }
}

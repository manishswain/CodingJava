package Codevita;
import java.util.Scanner;
public class Test
{
    public static void main(String[] args) 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("66");
        }
        System.out.println(getInput());
    }

    private static int getInput() 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        return n;
        
    }
}
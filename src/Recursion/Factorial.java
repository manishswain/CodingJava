package Recursion;
import java.util.*;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            System.out.println(fact(n));
        }
        sc.close();    
    }

    private static long fact(long n) 
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Practice 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        
        System.out.println(fact(n));
        sc.close();
    }

    private static BigInteger fact(int n) 
    {
        BigInteger fact=BigInteger.ONE;

        for(int i=2;i<=n;i++)
        {
            fact=fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }
}
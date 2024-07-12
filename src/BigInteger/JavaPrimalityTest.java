package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String n = sc.nextLine();

        BigInteger x=new BigInteger(n);

        boolean prime=x.isProbablePrime(1);

        if(prime) System.out.print("prime");
        else
            System.out.print("not prime");


        sc.close();
    }    
}
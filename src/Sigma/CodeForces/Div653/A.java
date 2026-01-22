package Div653;
import java.util.Scanner;
public class A 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long x= sc.nextLong();
            long y = sc.nextLong();
            long n= sc.nextLong();
            if(n/x*x+y>n)
            {
                System.out.println(n/x*x+y-x);
                continue;
            }
            System.out.println(n/x*x+y);
        }    
        sc.close();
    }       
}

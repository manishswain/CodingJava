package Div3667;

import java.util.Scanner;

public class B 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a=sc.nextInt();
            long b=sc.nextInt();
            long x=sc.nextInt();
            long y=sc.nextInt();
            long n=sc.nextInt();

            if(n-y<n-x)
            {
                long temp=a;
                a=b;
                b=temp;;

                long temp1=x;
                x=y;
                y=temp1;
            }
            if(a-n>=x)
            {
                a=a-n;
                n=0;
            }
            else
            {

            }
     
        }   
        sc.close(); 
    }       
}

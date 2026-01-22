package Div3667;

import java.util.Scanner;

public class A 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long N=sc.nextInt();
            long M=sc.nextInt();
            long n=Math.max(N, M);
            long m=Math.min(N, M);
            if( n==m)
            {
                System.out.println(0);
                continue;
            }
            long diff=n-m;
            long ans=0;
            if(diff%10==0)
            {
                ans=diff/10;
            }
            else
            {
                ans=diff/10 + 1;
            }
            System.out.println(ans);
        }    
        sc.close();
    }   
}

package Div636;

import java.util.Scanner;

public class A 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n= sc.nextLong();
            for(int i=1;i<Integer.MAX_VALUE;i++)
            {
                if(n%(int)Math.pow(2,i)-1==0)
                {
                    int ans = (int) (n / (int) Math.pow(2, i) - 1);
                    System.out.println(ans);
                    break;
                }
            }
        }    
        sc.close();
    }        
}

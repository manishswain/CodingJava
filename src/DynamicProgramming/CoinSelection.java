package DynamicProgramming;

import java.util.Scanner;

public class CoinSelection 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int value=sc.nextInt();
        int result=solve(value);
        System.out.println(result);
        sc.close();
    }
    private static int solve(int value) 
    {
        int coins[]={10,5,2,1};
        if(value<0) return 0;
        if(value==0) return 0;
        int result=Integer.MAX_VALUE;
        for(int x:coins)
        {
            result=Math.min(result,solve(value-x)+1);
        }
        return result;
    }
}
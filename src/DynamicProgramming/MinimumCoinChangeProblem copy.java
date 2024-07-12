package DynamicProgramming;

import java.util.Arrays;

class MinimumCoinChangeProblemRecursive 
{
    public static void main(String[] args) 
    {
        int coins[]={9, 6, 5, 1}; 
        int sum=11;
        
        int minres=minimumNumberOfCoins(coins,sum,coins.length);
        System.out.println(minres);
        
    }

    private static int minimumNumberOfCoins(int[] coins, int sum, int length) 
    {
        if(sum==0 && length==0)
        {
            return 0;
        }
                if(coins[length-1]<=sum)
                {
                   return  Math.min(1+minimumNumberOfCoins(coins, sum-coins[length-1], length),minimumNumberOfCoins(coins, sum, length-1));
                }
                else
                   return minimumNumberOfCoins(coins, sum, length-1);
             
    }
}
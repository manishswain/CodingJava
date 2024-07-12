package DynamicProgramming;

import java.util.Arrays;

public class MinimumCoinChangeProblem 
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
        int dp[][]=new int[coins.length+1][sum+1];

        for(int i=0;i<coins.length+1;i++)
        {
            dp[i][0]=0;
        }
        for(int j=1;j<sum+1;j++)
        {
            dp[0][j]=Integer.MAX_VALUE-1;
        }

        /* for(int j=1;j<sum+1;j++)
        {
            if(j%coins[1]==0)
            {
                dp[1][j]=j/coins[1];
            }
            else
                dp[1][j]=Integer.MAX_VALUE-1;
        }
 */
        for(int i=1;i<coins.length+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(coins[i-1]<=j)
                {
                    dp[i][j]=Math.min(1+dp[i][j-coins[i-1]], dp[i-1][j]);
                }
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        System.out.println(Arrays.deepToString(dp).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        return dp[coins.length][sum];
       
    }
}
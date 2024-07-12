package DynamicProgramming;

import java.util.Arrays;

public class RodCuttingProblem 
{
    public static void main(String[] args) 
    {
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int maxlen=8;
        int profit=findProfit(length,price,maxlen,length.length);
        System.out.println(profit);
    }

    private static int findProfit(int[] length, int[] price, int maxlen,int n) 
    {
        int dp[][]=new int[price.length+1][maxlen+1];
        for(int i=0;i<price.length+1;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<maxlen+1;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<price.length+1;i++)
        {
            for(int j=1;j<maxlen+1;j++)
            {
                if(length[i-1]<=j)
                {
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                }
                else
                    dp[i][j]=dp[i-1][j];
                    
            }
        }
        System.out.println(Arrays.deepToString(dp).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        return dp[price.length][maxlen];
    }
}
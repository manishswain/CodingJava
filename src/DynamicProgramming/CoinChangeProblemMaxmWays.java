    package DynamicProgramming;

    import java.util.Scanner;

    public class CoinChangeProblemMaxmWays 
    {
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int sum=sc.nextInt();
            int n=sc.nextInt();
            int coin[]=new int[n];
            for(int i=0;i<n;i++)
            {
                coin[i]=sc.nextInt();
            }         
            long res=coinChangeFinder(coin,sum,coin.length); 
            System.out.println(res); 
            sc.close();
        }

        private static long coinChangeFinder(int[] coin, int sum, int length) 
        {
            long dp[][]=new long[length+1][sum+1];
            for(int j=0;j<length+1;j++)
            {
                dp[j][0]=1;
            }
            for(int j=0;j<sum+1;j++)
            {
                dp[0][j]=0;
            }
            for(int i=1;i<length+1;i++)
            {
                for(int j=1;j<sum+1;j++)
                {
                    if(coin[i-1]<=j)
                    {
                        dp[i][j]=dp[i][j-coin[i-1]]+dp[i-1][j];
                    }
                    else 
                        dp[i][j]=dp[i-1][j];
                }
            }
            return dp[length][sum];
        }
    }
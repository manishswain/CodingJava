package DynamicProgramming;

import java.util.Scanner;

public class MinmOperationConversion1Strto2Str 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();           
            int t[][]=new int[n+1][m+1];
            int res=lcs(str1,str2,n,m,t);
            System.out.println(n+m-(2*res));
        }
        sc.close();    
    }

    private static int lcs(String str1, String str2, int n, int m, int[][] t) 
    {
        for(int i=0;i<=n;i++)
        {
            t[i][0]=0;
        }
        for(int i=0;i<=m;i++)
        {
            t[0][i]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    t[i][j]=1+t[i-1][j-1];
                }
                else
                t[i][j]=Math.max(t[i][j-1], t[i-1][j]);
            }
        }
        return t[n][m];
    }


}
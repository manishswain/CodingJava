package DynamicProgramming;

import java.util.Arrays;

public class LCSMemoize
{
       public static void main(String[] args) 
       {
            String s1="ABCDGH";
            String s2="AEDFHR";
            int n=s1.length();
            int m=s2.length();
            int t[][]=new int[n+1][m+1];
            for (int[] row : t) 
                Arrays.fill(row, -1);
            int length=lcs(s1,s2,n,m,t);
            System.out.println(length);            
       }

       private static int lcs(String s1, String s2, int n, int m,int[][] t) 
       {
           if(n==0 || m==0)
           {
               return 0;
           }
           if(t[n][m]!=-1)
           {
               return t[n][m];
           }
           if(s1.charAt(n-1)==s2.charAt(m-1))
           {
               return t[n][m]=1+lcs(s1, s2, n-1, m-1,t);
           }
           else 
               return t[n][m]=Math.max(lcs(s1, s2, n-1, m,t), lcs(s1, s2, n, m-1,t));
       }
}
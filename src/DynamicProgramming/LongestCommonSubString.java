package DynamicProgramming;
public class LongestCommonSubString
{
       public static void main(String[] args) 
       {
            String s1="ABCD";
            String s2="BCDA";
            int n=s1.length();
            int m=s2.length();
            int length=lcs(s1,s2,n,m);
            System.out.println(length);            
       }

       private static int lcs(String s1, String s2, int n, int m) 
       {
           int t[][]=new int[n+1][m+1];
           for(int i=0;i<n+1;i++)
           {
               t[i][0]=0;
           }
           for(int i=0;i<m+1;i++)
           {
               t[0][i]=0;
           }
           int max=0;
           for(int i=1;i<n+1;i++)
           {
               for(int j=1;j<m+1;j++)
               {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        t[i][j]=1+t[i-1][j-1];
                        max=Math.max(max, t[i][j]);
                    }
                    else 
                        t[i][j]=0;
               }
            }
            return max;
       }
}
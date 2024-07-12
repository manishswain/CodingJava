package DynamicProgramming;
public class PrintLCS
{
       public static void main(String[] args) 
       {
            String s1="ABCDGH";
            String s2="ABVGGFH";
            int n=s1.length();
            int m=s2.length();
            String ans=lcs(s1,s2,n,m);
            System.out.println(ans);            
       }

       private static String lcs(String s1, String s2, int n, int m) 
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

           for(int i=1;i<n+1;i++)
           {
               for(int j=1;j<m+1;j++)
               {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        t[i][j]=1+t[i-1][j-1];
                    }
                    else 
                    t[i][j]=Math.max(t[i][j-1], t[i-1][j]);
               }
            }
            int i=n,j=m;
            String ans="";
            while(i>0 && j>0)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {                   
                    ans=ans+s1.charAt(i-1);
                    i--;j--;
                }
                else
                {
                    if(t[i][j-1]>t[i-1][j])
                    {
                        j--;
                    }
                    else
                        i--;
                }
            }
            return new StringBuilder(ans).reverse().toString();
       }
}
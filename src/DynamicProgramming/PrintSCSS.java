package DynamicProgramming;
public class PrintSCSS 
{
       public static void main(String[] args) 
       {
            String s1="AGGTAB";
            String s2="AGGTAB";
            int n=s1.length();
            int m=s2.length();
            String length=lcs(s1,s2,n,m);
            System.out.println(length);           
       }

       private static String lcs(String s1, String s2, int n, int m) 
       {
            int t[][]=new int[n+1][m+1];
            
            for(int i=0;i<=n;i++)
            {
                t[i][0]=0;
            }
            for(int i=0;i<=m;i++)
            {
                t[0][i]=0;
            }

            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                    {
                        t[i][j]=1+t[i-1][j-1];
                    }
                    else
                    {
                        t[i][j]=Math.max(t[i-1][j], t[i][j-1]);
                    }
                }
            }
            int i=n,j=m;
            String s="";
            while(i>0 && j>0)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    s=s+s1.charAt(i-1);
                    i--;j--;
                }
                else
                {
                    if(t[i-1][j]>t[i][j-1])
                    {
                        s=s+s1.charAt(i-1);
                        i--;
                    }
                    else
                    {
                        s=s+s2.charAt(j-1);
                        j--;
                    }
                }
            } 
            while(i>0)
            {
                s=s+s1.charAt(i-1);
                i--;
            } 
            while(j>0)
            {
                s=s+s2.charAt(j-1);
                j--;
            } 
            return new StringBuilder(s).reverse().toString();     
       }
}

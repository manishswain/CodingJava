package DynamicProgramming;

//import java.util.Arrays;

public class KnapSack01RecursiveTopDown
{
    static int t[][]=new int[50][50];
    public static void main(String[] args) 
    {
        //System.out.println(Arrays.deepToString(t).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        int wt[]={24,10,10,7};
        int val[]={24,18,18,10};
        int weight=25;
        int n=wt.length;
        long start=System.currentTimeMillis();
        int fval=knapSack(wt,val,weight,n);
        System.out.println(fval);    
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static int knapSack(int[] wt, int[] val, int weight, int n)  
    {
        for(int i=0;i<n+1;i++)
        {
            t[i][0]=0;
        }
        for(int j=0;j<weight+1;j++)
        {
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<weight+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }
                else
                    t[i][j]=t[i-1][j];
            }
        }
        return t[n][weight];
    }

    /* private static int knapSack(int[] wt, int[] val, int weight, int n) {
        if(n==0 || weight==0)
        {
            return 0;
        }
        if(t[n][weight]==-1)
        {
            if(wt[n-1]<=weight)
            {
                return t[n][weight]=Math.max(val[n-1]+knapSack(wt, val, weight-wt[n-1], n-1),knapSack(wt, val, weight, n-1));
            }
            
            return t[n][weight]=knapSack(wt, val, weight, n-1);
        }
        else
        {
            return t[n][weight];
        }
    } */
}
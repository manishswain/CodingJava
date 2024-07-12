package DynamicProgramming;

import java.util.Arrays;

public class KnapSack01RecursiveMemoize 
{
    static int t[][]=new int[50][50];
    public static void main(String[] args) 
    {
        for (int[] row : t) 
            Arrays.fill(row, -1); 
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

    private static int knapSack(int[] wt, int[] val, int weight, int n) {
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
    }
}
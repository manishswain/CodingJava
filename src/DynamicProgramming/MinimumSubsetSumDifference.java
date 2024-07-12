package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsetSumDifference 
{
    public static void main(String[] args) 
    {
        int arr[]={1,5,6,11};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }     
        int ans= minimumSubsetSumDiff(arr,sum);
        System.out.println(ans);
    }

    private static int minimumSubsetSumDiff(int[] arr, int   sum) 
    {
        int n=arr.length;
        boolean t[][]=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++)
            t[i][0]=true;
        for(int j=1;j<sum+1;j++)
            t[0][j]=false; 
            
            for(int i=1;i<n+1;i++)
            {
                for(int j=1;j<sum+1;j++)
                {
                    if(arr[i-1]<=j)
                    {
                        t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                    }
                    else
                        t[i][j]=t[i-1][j];
                }
            }
        System.out.println(Arrays.deepToString(t).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=(sum+1)/2;i++)
        {
            if(t[n][i])
            {
                list.add(i);
            }
        }
        System.out.println(list);
        int minm=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            minm=Math.min(minm, sum-(2*list.get(i)));
        }
        return Math.abs(minm);
    } 
}
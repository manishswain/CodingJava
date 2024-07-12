package DynamicProgramming;

import java.util.Scanner;

public class EqualSubsetSumTopDown 
{
    public static void main(String[] args) 
    {
        
        
        Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                int arr[]=new int[n];
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    arr[i]=sc.nextInt();
                    sum+=arr[i];
                }
                boolean ans=false;
                if(sum%2==0)
                {
                    ans= checkSubsetSum(arr,sum/2);
                }        
                if(ans)
                    System.out.println("YES");
                else 
                    System.out.println("NO");
            }  
            sc.close();
    }  

    private static boolean checkSubsetSum(int[] arr, int sum) 
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
        //System.out.println(Arrays.deepToString(t).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        return t[n][sum];
    }
}
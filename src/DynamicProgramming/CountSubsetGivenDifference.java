package DynamicProgramming;
import java.util.Arrays;
public class CountSubsetGivenDifference 
{
    public static void main(String[] args) 
    {
        int arr[]={3,5,5,10,6,8,2,2};
        int diff=2;      
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int sum1=(diff+sum)/2;
        int ans= countSubsetSum(arr,sum1);
        System.out.println(ans);
    }

    private static int countSubsetSum(int[] arr, int sum) 
    {
        int n=arr.length;
        int t[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++)
            t[i][0]=1;
        for(int j=1;j<sum+1;j++)
            t[0][j]=0; 
            
            for(int i=1;i<n+1;i++)
            {
                for(int j=1;j<sum+1;j++)
                {
                    if(arr[i-1]<=j)
                    {
                        t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j];
                    }
                    else
                        t[i][j]=t[i-1][j];
                }
            }
        System.out.println(Arrays.deepToString(t).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        return t[n][sum];
    }        
}
package Array;
import java.util.*;
public class KadanesAlgoBrute
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            kadanesAlgo(arr,n);
        }
        sc.close();
    }
    private static void kadanesAlgo(int[] arr, int n) 
    {
        int sum=0,max=Integer.MIN_VALUE;
        int tempsum=0;
        for(int i=0;i<n;i++)
        {
            
            if(i<n)
            {
                sum+=arr[i];
                if(sum>max)
                {
                    max=sum;
                }
            }
            tempsum=sum;
            for(int j=0;j<i;j++)
            {
                tempsum-=arr[j];
                if(tempsum>max)
                {
                    max=tempsum;
                }
            }
            
        }
        if(max>tempsum)
            System.out.println(max);
        else
            System.out.println(tempsum);
    }
}
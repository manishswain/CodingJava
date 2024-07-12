package Array;
import java.util.*;
public class SubArraySum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            subArrayFinder(arr,n,sum);
        } 
        sc.close();  
    }
    private static int subArrayFinder(int[] arr, int n, int sum) 
    {
        int checksum=arr[0],start=0;
        for(int i=1;i<=n;i++)
        {
            while(checksum>sum   &&  start<i-1)
            {
                checksum=checksum-arr[start];
                start++;
            }
            if(checksum==sum)
            {
                int p=i-1;
                System.out.println((start+1)+" "+(p+1));
                return 1;
            }
            if(i<n)
                checksum=checksum+arr[i];
        }
        System.out.println(-1);
        return 0;
    }
}
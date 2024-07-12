package Recursion;
import java.util.*;
public class ArraySum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(sum(arr,0,n));
        }
        sc.close();
    }

    private static int sum(int[] arr,int i, int n) {
        if(i==n)
        {
            return 0;
        }
        return arr[i]+sum(arr, i+1, n);
    }
}
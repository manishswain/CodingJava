package Test;

import java.util.*;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res = closestpair(n,arr);
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int temp= Math.abs(arr[i]-arr[i-1]);
            if(temp<diff)
            {
                diff=temp;
            }
        }
        System.out.println(diff);
    }

    public static int closestpair(int n,int arr[])
    {       
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            int temp= Math.abs(arr[i]-arr[i-1]);
            if(temp<diff)
            {
                diff=temp;
            }
        }
        return diff;
    }
}

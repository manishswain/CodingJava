package Array;

import java.util.*;

public class MissingNumberOptimal
{
    public static void main(String[] args) 
    {
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            int arr[]=new int[n+1];
            arr[0]=1;
            for(int i=0;i<n-1;i++)
            {
                arr[sc.nextInt()]++;
            }
            for(int j=1;j<n+1;j++)
            {
                if(arr[j]==0)
                {
                    System.out.println(j);
                    break;
                }
            }
        }
        sc.close();
    }    
}
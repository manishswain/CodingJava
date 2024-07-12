package Array;

import java.util.*;

public class MissingNumberBrute
{
    public static void main(String[] args) 
    {
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            int count=0;
            int arr[]=new int[n-1];
            for(int i=0;i<n-1;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]==(i+1))
                {
                    count++;
                }
                else
                {
                    System.out.println(i+1);
                    break;
                }
                if(count==n-1)
                {
                    System.out.println(count+1);
                    break;
                }
            }
        }
        sc.close();
    }    
}
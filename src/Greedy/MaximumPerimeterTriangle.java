package Greedy;
import java.util.*;
public class MaximumPerimeterTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=n-1;i>1;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                for(int k=j-1;k>=0;k--)
                {
                    if(!(arr[k]+arr[j]<arr[i]) && !(arr[k]+arr[j]==arr[i]))
                    {
                        System.out.print(arr[k]+" "+arr[j]+" "+arr[i]);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
        sc.close();    
    }
}
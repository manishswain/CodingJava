package Greedy;
import java.util.*;
public class MarkAndToys 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextInt();
        sc.close();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        int i=0;
        for(i=0;i<n;i++)
        {
            if(!(k<0))
            {
                k-=arr[i];
            }
            else
            {
                break;
            }
        }
        System.out.println(i-1);

       
    }    
}

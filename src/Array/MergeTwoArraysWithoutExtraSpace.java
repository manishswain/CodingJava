package Array;
import java.util.*;
public class MergeTwoArraysWithoutExtraSpace 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int firstarr[]=new int[n];
            int secondarr[]=new int[m];
            for(int i=0;i<n;i++)
            {
                firstarr[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                secondarr[i]=sc.nextInt();
            }
            merge(firstarr,secondarr,n,m);
        }
        System.out.println();
        sc.close();
    }
    private static void merge(int[] firstarr, int[] secondarr,int n,int m) 
    {
        int j;
        for(int i=m-1;i>=0;i--)
        {
            int last=firstarr[n-1];
            for(j=n-2;j>=0&&secondarr[i]<firstarr[j];j--)
            {
                firstarr[j+1]=firstarr[j];          
            }
            if(j!=n-2 || last>secondarr[i])
            {
                firstarr[j+1]=secondarr[i];
                secondarr[i]=last;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(firstarr[i]+" ");
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(secondarr[i]+" ");
        }
    }
}
package HackerRank;
import java.util.*;
public class CountingTriplets 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>(n);
            int count=0;
            for(int j=0;j<n;j++)
            {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            for(int k=0;k<n-2;k++)
            {
                for(int l=k+1;l<n-1;l++)
                {
                    int sum=arr.get(k)+arr.get(l);
                    if(arr.contains(sum))
                    {
                        count++;
                    }
                }
            }
            if(count>0)
                System.out.println(count);
            else
                System.out.println(-1);
        }
        sc.close();    
    }    
}
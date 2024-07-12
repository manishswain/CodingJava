package MockVita;
import java.util.*;
public class MinimizeTheSum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>(n,Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int z=sc.nextInt();
            pq.add(z);
            sum+=z;
        }
        System.out.println(pq);
        for(int i=0;i<k;i++)
        {
            int temp=pq.peek();
            pq.poll();
            sum-=temp;

            sum+=temp/2;
            pq.add(temp/2);
        }
        System.out.println(sum);
        sc.close();    
    }    
}
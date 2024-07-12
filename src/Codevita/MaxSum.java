package Codevita;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxSum 
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int w=sc.nextInt();
            int d=sc.nextInt(); int e=w+d;
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                pq.add(x); 
                pq1.add(x); 
            }
            long sum1=0;long sum2=0;
            int rem1=n/w;
            int rem2=n/e;
            while(pq.size()>rem1)
            {
                sum1+=pq.poll();
            }
            while(pq1.size()>rem2)
            {
                sum2+=pq1.poll();
            }
            if(sum1>sum2)
            {
                System.out.println("Wrong "+Math.abs(sum1-sum2));
            }
            else if(sum1<sum2)
            {
                System.out.println("Right "+Math.abs(sum1-sum2));
            }
            else 
                System.out.println("Both are right");
            sc.close();
    }    
}
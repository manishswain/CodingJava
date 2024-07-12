package Array;

import java.util.*;

public class MissingNumberOptimal1
{
    public static void main(String[] args) 
    {
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int n=sc.nextInt();
            int total=(n*(n+1))/2;
            int sum=0;
            for(int i=0;i<n-1;i++)
            {
               sum+=sc.nextInt();
            }
            System.out.println(total-sum);
            
        }
        sc.close();
    }    
}
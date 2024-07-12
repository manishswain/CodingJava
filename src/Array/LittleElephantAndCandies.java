package Array;
import java.util.*;
public class LittleElephantAndCandies 
{
    public static void main(String[] args)   
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=sc.nextInt();
            }
            if(sum>c)
            {
                System.out.println("No");
            }
            else 
                System.out.println("Yes");
        }
        sc.close();
    } 
}
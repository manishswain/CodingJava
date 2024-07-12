package HackerRank;
import java.util.*;

public class HurdleRace 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int h=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(x-h>0&&ans<x-h)
            {
                ans =x-h;
            }
        }
        if(ans==0)
        {
            System.out.println(0);
        }
        else
            System.out.println(ans);
        sc.close();   
    }
}
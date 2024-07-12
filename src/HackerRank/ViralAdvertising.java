package HackerRank;
import java.util.*;
public class ViralAdvertising 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        double shared=5;
        double liked=Math.floor(shared/2);
        double cumulative=liked;
        for(int i=2;i<=t;i++)
        {
            shared=liked*3;
            liked=Math.floor(shared/2);
            cumulative+=liked;
            if(t==i)
            {
                System.out.println((int)cumulative);
            }
        }
        sc.close();    
    }    
}
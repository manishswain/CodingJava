package HackerRank;
import java.util.*;
public class BeautifulDays 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int last=sc.nextInt();
        int d=sc.nextInt();

        int count=solve(first,last,d);
        System.out.println(count);
        sc.close();

    }
    private static int solve(int first, int last, int d) 
    {
        int count=0;
        for(int i=first;i<=last;i++)
        {
            
            StringBuilder sb=new StringBuilder(String.valueOf(i));
            String rev=new String(sb.reverse());
            int j=Integer.parseInt(rev);
            int diff=Math.abs(i-j);
            if(diff%d==0)
            {
                count++;
            }
        }
        return count;
    }
}
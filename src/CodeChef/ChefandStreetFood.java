package CodeChef;
import java.util.*;
class ChefandStreetFood
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int n=sc.nextInt();
            int best=0;
            for(int i=0;i<n;i++)
            {
                int s=sc.nextInt();int p=sc.nextInt();int v=sc.nextInt();
                best=Math.max(best,p/(s+1) * v);
            }
            System.out.println(best);
        }
        sc.close();    
    }
}
package HackerRank;
import java.util.*;
public class AngryProfessor
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            int count=0;
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                if(arr[j]<=0)
                {
                    count++;
                }
            }
            if(count>=m)
            {
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }
        sc.close(); 
    }
}
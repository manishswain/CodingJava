package HackerRank;
import java.util.*;
public class BirthdayChocolate 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int m=sc.nextInt();
		int flag=0;
		for(int i=0;i<=n-m;i++)
		{
			int sum=0;
			for(int j=i;j<i+m;j++)
			{
				sum+=arr[j];				
			}
			if(sum==d)
			{
				flag++;
			}
		}
		System.out.println(flag);
		sc.close();
	}
}

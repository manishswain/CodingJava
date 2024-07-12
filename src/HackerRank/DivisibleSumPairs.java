package HackerRank;
import java.util.*;
public class DivisibleSumPairs 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int k=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]+arr[j])%k==0)
				{
					System.out.println(i+""+j);
					flag++;
				}
			}
		}
		System.out.println(flag);
		sc.close();
	}
}

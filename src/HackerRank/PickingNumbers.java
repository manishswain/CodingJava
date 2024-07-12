package HackerRank;
import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers 
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
		Arrays.sort(arr);
		int max=0;int fmax=Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(arr[j]-arr[i])<=1)
				{
					max++;
					continue;
				}
			}
			if(max>fmax)
			{
				fmax=max;
			}
			max=0;
		}
		System.out.println(fmax+1);
		sc.close();
	}
}

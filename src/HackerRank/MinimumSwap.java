package HackerRank;
import java.util.Scanner;

public class MinimumSwap 
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
		int res=minimumSwap(arr,n);
		System.out.println(res);
		sc.close();
	}
	static int minimumSwap(int[] arr,int n) 
	{
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(i<arr[i]-1)
			{
				swap(i,Math.min(n,arr[i]-1),arr);
				flag++;
				i--;
			}
		}
		return flag;
	}
	static void swap(int i, int mid,int arr[]) 
	{
		int temp;
		temp=arr[i];
		arr[i]=arr[mid];
		arr[mid]=temp;		
	}
}

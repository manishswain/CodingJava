package HackerRank;
import java.util.*;
public class BreakingRecords 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		arr[0]=sc.nextInt();
		int max=arr[0],min=arr[0],maxflag=0,minflag=0;		
		for(int i=1;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			{
				maxflag++;
				max=arr[i];
			}
			if(arr[i]<min)
			{
				minflag++;
				min=arr[i];
			}
		}
		System.out.println(maxflag+" "+minflag);
		sc.close();
	}
	
}

package HackerRank;
import java.util.*;
public class ElectronicShop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arrn[]=new int[n];
		int arrm[]=new int[m];
		for(int i=0;i<n;i++)
			arrn[i]=sc.nextInt();
		for(int i=0;i<m;i++)
			arrm[i]=sc.nextInt();
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arrn[i]+arrm[j]<=b&&arrn[i]+arrm[j]>max)
				{
					max=arrn[i]+arrm[j];
				}
			}
		}
		if(max==0)
			System.out.println(-1);
		else
			System.out.println(max);
			sc.close();	
	}
}

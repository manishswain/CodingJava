package HackerRank;
import java.util.*;
public class BetweenTwoSets 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arrn[]=new int[n];
		int arrm[]=new int[m];		
		for(int i=0;i<n;i++)
		{
			arrn[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			arrm[j]=sc.nextInt();
		}
		int tflag=0,pflag=0,flag=0;
		for(int k=arrn[n-1];k<=arrm[0];k++)
		{
			tflag=0;pflag=0;
			for(int j=0;j<n;j++)
			{
				if(k%arrn[j]==0)
				{
					++tflag;
				}
			}
			if(tflag==arrn.length)
			{
				for(int i=0;i<m;i++)
				{
					if(arrm[i]%k==0)
					{					
						++pflag;
					}
				}
			}
			if(pflag==arrm.length)
				flag++;
		}
		System.out.println(flag);
		sc.close();	
	}
}

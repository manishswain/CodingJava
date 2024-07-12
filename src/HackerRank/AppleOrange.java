package HackerRank;
import java.util.*;
public class AppleOrange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int apple[]=new int[m];
		int orange[]=new int[n];
		for(int i=0;i<m;i++)
		{
			apple[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			orange[j]=sc.nextInt();
		}
		int fa=0,fo=0;
		for(int i=0;i<m;i++)
		{
			if(a+apple[i]>=s&&a+apple[i]<=t)
			{
				fa++;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(b+orange[j]>=s&&b+orange[j]<=t)
			{
				fo++;
			}
		}
		System.out.println(fa+"\n"+fo);
		sc.close();
	}
}

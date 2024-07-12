package HackerRank;
import java.util.*;
public class GradingSystem 
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
		for(int i:arr)
		{
			if(i<38)
			{
				System.out.println(i);
			}
			else
			{
				if(i%10<3||(i%10<8&&i%10>=5))
				{
					System.out.println(i);
				}
				else
					System.out.println(((i/5)+1)*5);
					
			}
		}
		sc.close();
	}
}

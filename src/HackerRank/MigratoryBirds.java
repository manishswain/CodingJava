
package HackerRank;
import java.util.*;
public class MigratoryBirds 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<n;i++)
		{
			arr[sc.nextInt()]++;
		}
		int max=arr[0],index=0;
		for(int i=1;i<10;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				index=i;
			}
		}
		System.out.println(index);
		sc.close();
		

	}
}

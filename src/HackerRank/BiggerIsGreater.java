package HackerRank;
import java.util.*;
public class BiggerIsGreater 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			answer(str);
		}
		sc.close();
	}

	static void answer(String str) 
	{
		char list[]=str.toCharArray();
		List<Character> lst=new ArrayList<Character>();
		for(char ch:list)
		{
			lst.add(ch);
		}
		int n=lst.size();boolean flag=false;
		
		for(int i=n-1;i>0;i--)
		{			
			if(lst.get(n-1).compareTo(lst.get(i-1))>0)
			{
				char temp=lst.get(i);
				lst.set(i,lst.get(i-1));
				lst.set(i-1,temp);
				flag=true;
				break;
			}
		}
		if(flag)
		{
			for(int j=0;j<lst.size();j++)
			{
				System.out.print(lst.get(j));
			}
			System.out.println();
		}
		else
		{
			System.out.println("no answer");
		}		
	}
}

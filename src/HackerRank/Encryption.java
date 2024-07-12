package HackerRank;
import java.util.*;
public class Encryption 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		double d=Math.sqrt(str.length());
		int x=0;
		if(d-(int)d!=0)
		{
			x=(int)d+1;
		}
		else
			x=(int)d;
		char arr[][]=new char[x][x];
		int k=0;String res="";
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x;j++)
			{
				if(k<str.length())
				{
					arr[i][j]=str.charAt(k);
					k++;
				}
			}
		}
		for(int i=0;i<x;i++)
		{
		    for(int j=0;j<x;j++)
		    {
		        res+=arr[j][i];                
		    } 
		    System.out.print(" ");
		}    
		System.out.print(res.replaceAll(" ",""));
		sc.close();
	}
}

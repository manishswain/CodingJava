package Codevita;
import java.util.Scanner;
import java.io.*;
//Question number 2

public class Average
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);	
 		int x = sc.nextInt(); // 3 2
		int y = sc.nextInt(); //5  4
		int n = sc.nextInt(); // no of days
		int ans = 0;
		boolean op = true;
		
		double[] closingBals = new double[n];
		for(int i = 0 ; i < n ; i++)
		{
			closingBals[i] = sc.nextDouble();
		}
		double currentavgone = 0;
		double previousavgone = 0;
		double currentavgtwo = 0;
		double previousavgtwo =0;
		for(int i = 0 ; i < closingBals.length;i++)
		{
			if(i<x)
			{
				previousavgone = currentavgone;
				currentavgone = 0.0;
				
			}
			else
			{
				double sum = 0.0;
				int count = 0;
				while(count != x)
				{
					sum = sum+(closingBals[i-count-1]);
					count++;
				}
				previousavgone = currentavgone;
				currentavgone = (sum/(double)x);
			}
            if(i<y)
			{
            	previousavgtwo = currentavgtwo;
				currentavgtwo = 0.0;
			}
			else
			{
				double sum = 0.0;
				int count = 0;
				while(count != y)
				{
					sum = sum+(closingBals[i-count-1]);
					count++;
				}
				previousavgtwo = currentavgtwo;
				currentavgtwo = sum/(double)y;
			}
            if((currentavgone >= previousavgone ^ currentavgtwo >= previousavgtwo)&&op)
            {
            	ans++;
            	op = false;
            }
            else
            {
            	op=true;
            }		
		}		
		System.out.print(ans+1);
		sc.close();
	}


}
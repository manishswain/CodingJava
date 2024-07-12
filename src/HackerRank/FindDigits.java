package HackerRank;
import java.util.Scanner;

public class FindDigits 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t --> 0)
        {
            int count=0;
            int n=sc.nextInt();
            int temp=n;

            while(temp!=0)
            {
                try {
                    if(n%(temp%10)==0)
                    {
                        count++;
                    }
                    temp=temp/10;                  
                } catch (Exception e) {
                    temp=temp/10;   
                }
            }
            System.out.println(count);
        }
        sc.close();    
    }    
}
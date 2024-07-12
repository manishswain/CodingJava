package String;
import java.util.*;
public class StringReverse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int a=0;a<t;a++)
        {
            String str=sc.nextLine();          
            String string[]=str.split("\\.");
            //display(string);
            int n=string.length;
            for(int i=0;i<(n/2);i++)
            {
                String temp=string[i];
                string[i]=string[n-1-i];
                string[n-1-i]=temp;
            }
            for(int j=0;j<n;j++)
            {
                if(j!=n-1)
                    System.out.print(string[j]+".");
                else
                {
                    System.out.print(string[j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }

    /* private static void display(String[] string) 
    {
        int n=string.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(string[i]+ " ");
        }
    } */
}
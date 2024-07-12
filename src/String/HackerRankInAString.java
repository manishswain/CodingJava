package String;
import java.util.*;
public class HackerRankInAString 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch[]="hackerrank".toCharArray();
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();int j=0;
            for(int i=0;i<str.length();i++)
            {
                if(ch[j]==str.charAt(i))
                { 
                    j++;
                    if(j==10)
                    {
                        break;
                    }
                }
            }
            if(j==10)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");               
            }
        }
        sc.close();
           
    }      
}
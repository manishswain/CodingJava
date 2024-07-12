package String;
import java.util.*;
public class LongestPalindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int max=0;
        
        for(int a=0;a<t;a++)
        {
            String result="";
            String str=sc.next();
            int n=str.length();
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<=n;j++)
                {  
                    String sub=str.substring(i, j);
                    String reverse=new StringBuilder(sub).reverse().toString();
                    if(sub.equals(reverse))
                    {
                        if(sub.length()>max)
                        {
                            max=sub.length();
                            result=sub;
                        }
                    }
                }
            }
            System.out.println(result);
        }
        sc.close();    
    }    
}
package String;
import java.util.*;
public class MarsExploration 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(i%3==0 && str.charAt(i)!='S')
            {
                count++;
            }
            else if(i%3==1 && str.charAt(i)!='O')
            {
                count++;
            }
            else if(i%3==2 && str.charAt(i)!='S')
            {
                count++;
            }        
        }
        System.out.println(count);
        sc.close();
    }       
}
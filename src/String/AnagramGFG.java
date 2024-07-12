package String;
import java.util.*;
public class AnagramGFG 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            String first=sc.next();
            String second=sc.next();
            if(first.length()!=second.length())
            {
                System.out.println("NO");
                break;
            }
            char ch[]=first.toCharArray();
            int arr[]=new int[26];
            for(int i=0;i<ch.length;i++)
            {
                arr[ch[i]-'a']++;
                arr[second.charAt(i)-'a']--;
            } 
            int count=0;          
            for(int j=0;j<26;j++)
            {               
                if(arr[j]!=0)
                {
                    System.out.println("NO");
                    break;
                }
                else
                    count++;
            }
            if(count==26)
            {
                System.out.println("YES");
            }
        }
        sc.close();    
    }    
}
package String;

import java.util.*;
import java.util.regex.Pattern;
public class TwoCharacters 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.next();
        int arr[] =new int[26];
        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        List<Character> list=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                list.add((char)(i+'a'));
            }
        }
        //System.out.println(Arrays.toString(ch));
        int max=0;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                StringBuilder sb=new StringBuilder(s);
                for(int m=0;m<sb.length();m++)
                {
                    if(sb.charAt(m)!=list.get(i) && sb.charAt(m)!=list.get(j))
                    {
                        sb.deleteCharAt(m--);
                    }
                }
                //System.out.println(sb);
                String res=new String(sb);
                if(Pattern.matches("^([a-z])(?!\\1)([a-z])(?:\\1\\2)*\\1?$", res))
                {
                    if(res.length()>max)
                    {
                        max=res.length();
                    }
                }                
            }
        }
        System.out.println(max);
        sc.close();   
    }    
}
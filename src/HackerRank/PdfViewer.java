package HackerRank;
import java.util.*;
public class PdfViewer 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[26];
        for(int i=97;i<26+97;i++)
        {
            arr[i-'a']=sc.nextInt();
        }
        String str=sc.next();
        char ch[]=str.toCharArray();
        int max=0;
        for(int i=0;i<ch.length;i++)
        {
            if(arr[ch[i]-'a']>max)
            {
                max=arr[ch[i]];
            }
        }
        System.out.println(max*(str.length()));
        sc.close();    
    }
}
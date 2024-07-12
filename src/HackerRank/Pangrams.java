package HackerRank;
import java.util.Scanner;

public class Pangrams 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[]=s.split(" ");
        int res[] = new int[26];
        for(int i=0;i<str.length;i++)
        {
            char temp[] = str[i].toCharArray();
            for(char c : temp)
            {
                c=Character.toLowerCase(c);
                res[c-'a']++;
            }
        }
        boolean flag =true ;
        for(int i=0;i<26;i++)
        {
            if(res[i]<1)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }
        sc.close();
    }    
}

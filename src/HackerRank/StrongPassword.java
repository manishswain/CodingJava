package HackerRank;
import java.util.Scanner;

public class StrongPassword 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.next();
        boolean lower=false,upper=false,special=false,digit=false;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
               upper=true;              
            }
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
               lower=true;              
            }
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
               digit=true;              
            }
            if((s.charAt(i)>=33 && s.charAt(i)<=45) || s.charAt(i)==64 || s.charAt(i)==94)
            {
               special=true;              
            }
        }
        if(!upper){count++;}if(!lower){count++;}if(!digit){count++;}if(!special){count++;}
        if(n+count>=6)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println(6-n);
        }
        sc.close();  
    }    
}
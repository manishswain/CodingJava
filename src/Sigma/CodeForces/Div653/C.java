package Div653;
import java.util.*;
public class C
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();sc.nextLine();
            String s =sc.nextLine();
            int fcount=0;
            ArrayList<Character> list = new ArrayList<>();
            for(char ch : s.toCharArray())
            {            
                list.add(ch);              
            }
            int count =0;
            for(int i=0;i<list.size();i++)
            {
                char ch =list.get(i);
                if(ch=='(')
                {
                    count++;
                    continue ;
                }
                if(ch==')' && count>0)
                {
                    count--;
                    continue ;
                }
                if(count==0 && ch==')')
                {
                    fcount++;
                    char temp=list.remove(i);
                    list.add(temp);count=0;
                    continue ;
                }
            }
            System.out.println(list);
        }    
        sc.close();
    }       
}


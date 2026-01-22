package EDUDiv2101;
import java.util.*;
public class A 
{
    public static void main(String[] args) 
    {
           Scanner sc= new Scanner(System.in);
           int t =sc.nextInt();sc.nextLine();
           while(t --> 0)
           {
               String str = sc.nextLine();
               if (str.length()%2!=0) 
               {
                System.out.println("NO");
                continue;
               }
               char[] ch = str.toCharArray();
               int sum=0,qsum=0;
               for(char c : ch)
               {
                   if(qsum<=00&&sum<0)
                   {
                       System.out.println("NO");
                       System.exit(0);
                   }
                   if(c=='(') sum++;
                   else if(c==')') sum--;
                   else qsum++;
               }
               if((sum+qsum)%2==0)
               {
                   System.out.println("YES");
               }
               else{
                   System.out.println("NO");
               }

           }
           sc.close();
    }    
}

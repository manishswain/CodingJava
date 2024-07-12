package HackerRank;
import java.util.*;
public class  CatAndMouse 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0;a<t;a++)
        {
            int d=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(Math.abs((b-c))==Math.abs((d-c)))
            {
                System.out.println("Mouse C");
            }
            else if(Math.abs((b-c))<Math.abs((d-c)))
            {
                System.out.println("Cat B");
            }
            else
                System.out.println("Cat A");
            

        }
        sc.close();    
    }    
}
package Codevita;
import java.util.Scanner;
public class B 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int p=sc.nextInt();
        int A= sc.nextInt();     
            A=A-n;
        int sum =0 ,level=1;
        int ans =0;
        while(sum<A)
        {
            int temp = (int)Math.pow(2, level);
            for(int i=0;i<temp;i++)
            {
                sum+=(n/p)*1;
                ans++;
                if(sum>=A)
                {
                    break;
                }
                
                n=n/p;
            }
            level++;
        }
        System.out.println(ans);
        sc.close();
    }   
}
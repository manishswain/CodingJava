package Test;
import java.util.*;
public class Solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        String str = sc.nextLine();
        if(str.length()<5 || str.length()>20)
        {
            System.out.println(str+" is an invalid length");
            return;
        }
        char ch[] = str.toCharArray();
        for(char x:ch)
        {
            if(Character.isAlphabetic(x))
            {
                continue;
            }
            else
            {
                System.out.println(str+" is an invalid input");
                return;
            }
        }
        String res="";
        for(int i=0;i<ch.length;i++)
        {
            if(i%2==0)
            {
                res+=Character.toLowerCase(ch[i]);
            }
            else
            {
                res+=ch[i];
            }
        }
        System.out.println(res);
    }
}

package Test;

import java.util.*;

public class Solution9 {
    public static void main(String[] args) {
        System.out.println(1.0/0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
       
        char ch[] = str.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            char x= ch[i];
            if(!Character.isLetter(x) && !Character.isDigit(x) && x!=' ')
            {   
                sum+=(int)x + i;
            }
        }
        System.out.println(sum);
    }
}

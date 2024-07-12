package Recursion;

import java.util.Scanner;

public class StringToInteger 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=integer(str,str.length()-1,0);
        System.out.println(n);
        sc.close();    
    }

    private static int integer(String str,int i,int j) 
    {
        if(i<0)
        {
            return 0;
        } 
        return (int)Math.pow(10,j)*((int)str.charAt(i)-48)+integer(str, i-1,j+1); 
    }
}
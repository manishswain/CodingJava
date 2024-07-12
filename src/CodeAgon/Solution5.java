package CodeAgon;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" "); 
        String res = "",last="";
        for(String temp: s)
        {
            res=res+Character.toUpperCase(temp.charAt(0));
            last=temp;
        }
        System.out.println(res+" "+last);
    }
}

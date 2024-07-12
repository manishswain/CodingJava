package Test;

import java.util.*;

public class Solution14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String l = sc.nextLine();
        System.out.println(str.replaceAll(l,""));
    }
    public String removingOccurences(String input1,String input2)
    {
        return input1.replaceAll(input2,"");
        
    }
}



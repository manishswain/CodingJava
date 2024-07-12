package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        char ch[]=str.toCharArray();
        int arr[]=new int[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            arr[i]=(int)ch[i];
        }
        Arrays.sort(arr);
        System.out.println((char)arr[0]);
    }
}

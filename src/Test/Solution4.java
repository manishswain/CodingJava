package Test;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            fact(arr[i]);
        }
    }

    private static void fact(int i) 
    {
        long ans =1;
        for(int j=2;j<=i;j++)
        {
            ans*=j;
        }
        System.out.println(ans);
    }
}

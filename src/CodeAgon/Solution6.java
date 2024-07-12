package CodeAgon;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            int num = sc.nextInt();
            int res = findSum(num);
            System.out.println(res);
        }
    }

    private static int findSum(int num) {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}

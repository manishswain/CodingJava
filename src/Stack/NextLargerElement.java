package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NextLargerElement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int res[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Deque<Integer> stack=new ArrayDeque<>();
            for(int i=n-1;i>=0;i--)
            {
                while(!stack.isEmpty() && arr[i]>=stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    res[i]=-1;
                }
                else
                {
                    res[i]=stack.peek();
                }
                stack.push(arr[i]);
            }
            for(int i:res)
                System.out.print(i+" ");
            System.out.println();
        }
        sc.close();     
    }   
}
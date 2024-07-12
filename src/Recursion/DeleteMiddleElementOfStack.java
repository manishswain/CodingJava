package Recursion;
import java.util.*;
public class DeleteMiddleElementOfStack 
{
    public static void main(String[] args) 
    {
        Deque<Integer> stack =new ArrayDeque<>();
        int n=9;
        for(int i=1;i<=9;i++)
        {
            stack.add(i);
        }
        int k=(n/2)+1;
        deleteMiddleElement(stack,k); 
        System.out.println(stack);   
    }

    private static void deleteMiddleElement(Deque<Integer>  stack, int k) 
    {
        if(stack.size()==0)
        {
            return;
        }
        if(k==1)
        {
            stack.pop();
        }
        int temp=stack.peek();
        stack.pop();
        deleteMiddleElement(stack, k-1);
        stack.push(temp);
    }
}

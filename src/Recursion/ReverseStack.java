package Recursion;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStack 
{
    public static void main(String[] args) 
    {
        Deque<Integer> stack =new ArrayDeque<>();
        for(int i=1;i<=9;i++)
        {
            stack.add(i);
        }

        reverseStack(stack); 
        System.out.println(stack);   
    }

    private static Deque<Integer> reverseStack(Deque<Integer> stack) 
    {
        if(stack.size()==0)
        {
            return stack;
        }
        int temp=stack.pop();
        reverseStack(stack);
        insert(stack,temp);

        return stack;
    }

    private static void insert(Deque<Integer> stack, int temp) 
    {
        if(stack.size()==0)
        {
            stack.push(temp);
            return;
        }
        int temp1=stack.pop();
        insert(stack, temp);
        stack.push(temp1);
    }
}

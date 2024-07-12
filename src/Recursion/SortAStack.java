package Recursion;

import java.util.*;

public class SortAStack 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Stack");
        int n=sc.nextInt();
        System.out.println("Enter the elemenst in random manner");
        Deque<Integer> list=new ArrayDeque<>(n);
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        recursionSort(list);
        System.out.println(list); 
        //System.out.println(count); 
        sc.close();  
    }

    private static void recursionSort(Deque<Integer> list) 
    {
        if(list.size()==1)
        {
            return;
        }
        int temp=list.poll();
        recursionSort(list);
        insert(list,temp);
    }

    private static void insert(Deque<Integer> list, int temp) 
    {
        
        if(list.size()==0 || list.peek()<=temp)
        {
            list.push(temp);
            return;
        }
        int val=list.poll();
        insert(list, temp);
        list.push(val);
    }
        
}
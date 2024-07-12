package Recursion;
import java.util.*;
public class RecursionSort 
{
    static int count=0;
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        System.out.println("Enter the elemenst in random manner");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        recursionSort(list);
        System.out.println(list); 
        System.out.println(count); 
        sc.close();  
    }

    private static void recursionSort(List<Integer> list) 
    {
        if(list.size()==1)
        {
            return;
        }
        int temp=list.get(list.size()-1);
        list.remove(list.size()-1);
        recursionSort(list);
        insert(list,temp);

    }

    private static void insert(List<Integer> list, int temp) 
    {
        count++;
        if(list.size()==0 || list.get(list.size()-1)<=temp)
        {
            list.add(temp);
            return;
        }
        int val=list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(list, temp);
        list.add(val);
    }
    
}
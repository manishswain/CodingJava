package Heap;
import java.util.*;

public class MaxHeapImpl 
{
    static Scanner sc=new Scanner(System.in);
    static List<Integer> heap=new ArrayList<>();
    static int sizeOfTree=0;//Size of the tree.
    public static void main(String[] args) 
    {
        heap.add(0);
        System.out.println("A new max heap is created");
        System.out.println("Enter the number of elements you want to enter");
        int t=sc.nextInt();
        System.out.println("Enter the numbers");
        while(t-->0)
        {
            insertToHeap(sc.nextInt());
        }
        System.out.println(heap);
        peek();
        System.out.println(heap);
        extractFromHeap();
        System.out.println(heap);
    }
    
    
    private static int extractFromHeap() 
    {
        int extractedValue=0;
        extractedValue=heap.get(1);
        
        heap.set(1, heap.get(sizeOfTree));
        heap.remove(sizeOfTree--);

        heapifyTopToBottom(1);
        return extractedValue;
    }

    private static void heapifyTopToBottom(int index) 
    {
        int left=index*2;
        int right=index*2+1;
        int largestChild=0;

        if(sizeOfTree<left)
        {
            return;
        }
        else if(sizeOfTree==left)
        {
            if(heap.get(index)<heap.get(left))
            {
                int temp=heap.get(index);
                heap.set(index, heap.get(left));
                heap.set(left, temp);
            }
            return;
        }
        else
        {
            if(heap.get(left)>heap.get(right))
            {
                largestChild=left;
            }
            else
            {
                largestChild=right;
            }
            if(heap.get(index)<heap.get(largestChild))
            {
                int temp=heap.get(index);
                heap.set(index, heap.get(largestChild));
                heap.set(largestChild, temp);
            }
        }
        heapifyTopToBottom(largestChild);
    }

    static void insertToHeap(int value)
    {
        heap.add(++sizeOfTree, value);

        heapifyBottomToTop(sizeOfTree);
              
    }

    private static void heapifyBottomToTop(int index) 
    {
        int parent = index/2;

        if(index <=1)//if we are at root of the tree then no more need to heapify
        {
            return;
        }

        if(heap.get(index)>heap.get(parent))
        {
            int temp=heap.get(index);
            heap.set(index, heap.get(parent));
            heap.set(parent, temp);
        }
        heapifyBottomToTop(parent);
    }

    private static void peek() 
    {
        if(sizeOfTree==0)
        {
            System.out.println("Tree is empty");
        }
        else{
            System.out.println("HEad is " +heap.get(1));
        }
    }

}
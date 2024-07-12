package Sorting;

import java.util.Arrays;

public class SortingAlgoritm 
{
    public static void main(String[] args) 
    {
        int arr[]={4, 2, 1 ,5 ,3} ;  
        /* bubbleSort(arr);
        insertionSort(arr);
        selectionSort(arr); */
        quickSortAlgo(arr);       
    }


    private static void quickSortAlgo(int[] arr) 
    {
        int low =0,high=arr.length-1;
        quickSort(arr ,low , high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) 
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) 
    {
        int pivot=arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;    
    }

    private static void swap(int[] arr, int i, int j) 
    {
         int temp = arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }

    private static void selectionSort(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=arr[0];
            int minId=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    min=arr[j];
                    minId=j;
                }
            }
            arr[i]^=min;
            arr[minId]^=arr[i];
            arr[i]^=min;
        }
        System.out.println("Selection Sort -"+ Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) 
    {
        for(int i=1;i<arr.length;i++)
        {
            int current =arr[i];
            int j=i-1;

            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("Insertion Sort-"+Arrays.toString(arr));
    }

    private static void bubbleSort(int[] a) 
    {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) 
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println("Bubble Sort-"+ Arrays.toString(a));
    }
}
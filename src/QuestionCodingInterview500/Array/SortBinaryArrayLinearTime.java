package QuestionCodingInterview500.Array;

import java.util.Arrays;

public class SortBinaryArrayLinearTime 
{
    public static void main(String[] args) 
    {
        int arr[]={1,0,1,0,1,0,0,1};
        
        sortBinaryArray(arr);
        System.out.println(Arrays.toString(arr));    
    }

    private static void sortBinaryArray(int[] arr) 
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==0)
            count++;
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++)
        {
            arr[i]=1;
        }

    }
    
}

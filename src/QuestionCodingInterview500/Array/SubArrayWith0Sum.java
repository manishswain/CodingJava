package QuestionCodingInterview500.Array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum 
{
    
    public static void main(String[] args) 
    {
        int arr[]={4,3,-1,4,2,7};
        
        checkSubArray(arr);    
    }

    private static void checkSubArray(int[] arr) 
    {
        Set<Integer> set=new HashSet<>();
        int n=arr.length;
        int sum=0;
        set.add(0);

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(!set.add(sum))
            {
                System.out.println("Subarray with 0 sum is present");
                return;
            }            
        }
        System.out.println("Not Present");


    }

}

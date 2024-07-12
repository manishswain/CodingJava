package QuestionCodingInterview500.Array;

import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSumOpt 
{
    public static void main(String[] args) 
    {
        int arr[]={8,7,2,5,3,1};
        int sum=4;
        
        findpair(arr,sum);    
    }

    private static void findpair(int[] arr, int sum) 
    {
        int n=arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(sum-arr[i]))
            {
                System.out.println("Pair Found at index "+mp.get(sum-arr[i])+" and "+i);
                return;
            }
            else 
            {
                mp.put(arr[i],i);
            }
        }
            System.out.println("PairNotFound");
    }
}

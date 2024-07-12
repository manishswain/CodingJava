package QuestionCodingInterview500.Array;

import java.util.*;

public class PrintSubArrayWith0sumOpt 
{
    public static void main(String[] args) 
    {
        int arr[]={ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        
        printSubArray(arr);    
    }

    private static void printSubArray(int[] arr) 
    {
        Map<Integer,List<Integer>> hasMap=new HashMap<>();

        insert(hasMap,0,-1);

        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(hasMap.containsKey(sum))
            {
                List<Integer> list=hasMap.get(sum);

                for(Integer temp :list)
                {
                    System.out.println("Subarray "+(temp+1)+" to "+ i);
                }
            }
            insert(hasMap, sum, i);
        }
    }

    private static void insert(Map<Integer, List<Integer>> hasMap, int key, int value) 
    {
        if(!hasMap.containsKey(key))
        {
            hasMap.put(key, new ArrayList<>());
        }

        hasMap.get(key).add(value);
    }
}

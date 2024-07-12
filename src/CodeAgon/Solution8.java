package CodeAgon;

import java.util.*;
import java.util.stream.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res = missingkeyboards(arr);
        System.out.println(res);
    }

     static int missingkeyboards(int[] Arr) {
        Arrays.sort(Arr);
        int temp=0,count=0;
        temp=Arr[0];
        for(int i=0;i<Arr.length-1;i++)
        {
            if(temp == Arr[i+1])
                continue;
            if(temp+1!=Arr[i+1])
            {
                count++;
                temp=Arr[i]+1;
            }
            temp=Arr[i+1];
        }   
        return count;
    }

}

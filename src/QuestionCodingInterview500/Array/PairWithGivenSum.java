package QuestionCodingInterview500.Array;

import java.util.Arrays;

public class PairWithGivenSum 
{
      public static void main(String[] args) 
      {
            int arr[]={8,7,2,5,3,1};
            int sum=25;
            
            findpair(arr,sum);
      }

      private static void findpair(int[] arr, int sum) 
      {
          int n=arr.length;

          Arrays.sort(arr);

          int i=0,j=n-1;boolean fl=true;
          while(i<j)
          {
              if(arr[i]+arr[j]==sum)
              {
                    System.out.println("Pair Found");
                    fl=false;
                    break;
              }
              else if(arr[i]+arr[j]<sum)
              {
                    i++;
              }
              else 
              {
                  j--;
              }
          }
          if(fl)
          {
              System.out.println("Pair not found");
          }
      }
}

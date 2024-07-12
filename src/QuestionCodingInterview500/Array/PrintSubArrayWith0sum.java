package QuestionCodingInterview500.Array;

public class PrintSubArrayWith0sum 
{
    public static void main(String[] args) 
    {
        int arr[]={4,2,-3,-1,0,4};
        
        printSubArray(arr);    
    }

    private static void printSubArray(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==0)
                {
                    System.out.println("Subarray with zero sum is from "+i+" to "+j);
                }
            }
        }
    }
}

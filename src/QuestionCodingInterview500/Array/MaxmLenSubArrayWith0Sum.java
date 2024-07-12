package QuestionCodingInterview500.Array;
public class MaxmLenSubArrayWith0Sum 
{
    public static void main(String[] args) 
    {
        int arr[]={0,0,1,0,1,0,1};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
        }
        check(arr);
    }

    private static void check(int[] arr) 
    {
    }
}

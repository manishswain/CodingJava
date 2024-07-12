package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class KadanesAlgoOptimal 
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader is =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        int t=Integer.parseInt(br.readLine());
        for(int a=0;a<t;a++)
        {
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=br.read();
            }
            kadanesAlgo(arr,n);
        }
    }
    private static void kadanesAlgo(int[] arr, int n) 
    {
        int localsum=arr[0],globalsum=arr[0];
        for(int i=1;i<n;i++)
        {
            localsum+=arr[i];
            if(localsum>arr[i])
            {
                localsum=arr[i];
            }
            if(localsum>globalsum)
            {
                globalsum=localsum;
            }
        }
        System.out.println(globalsum);
    }
}
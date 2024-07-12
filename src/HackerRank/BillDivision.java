package HackerRank;
import java.util.Scanner;

public class BillDivision 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int fShare=sc.nextInt();
        int annaShare=(sum-arr[k])/2;
        //System.out.println(annaShare);
        if(annaShare==fShare)
        {
            System.out.println("Bon Appetit");
        }
        else
        {
            System.out.println(fShare-annaShare);
        }

        sc.close();
    }    
}

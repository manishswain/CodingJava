package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n = sc.nextInt();
        if(n<1)
        {
            System.out.println(n+" is an invalid limit");
            return;
        }
        int arr[]= new int[n];
        int arrnew[]=new int[100];
        int k=0,mid=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>=100&&arr[i]<=999)
            {
                int m=arr[i];
                m=m/10;
                mid=m%10;
            }
            else{
                System.out.println("Provided "+n+" is not valid");
                return;
            }
            if(mid%3==0)
            {
                arrnew[k]=arr[i];
                k++;
            }
        }
        if(arrnew[0]==0)
        {
            System.out.println("The "+n+" values arer not trendy number");
            return;
        }
        for(int j=0;j<k;j++)
        {
            System.out.println(arrnew[j]+" ");
        }
    }
public int sum(int input1,int input2[])
{
    Arrays.sort(input2);
    return input2[0]+input2[input1-1];//au ssei block re jaha faltu comments au exception wala line taku udeide
}
}

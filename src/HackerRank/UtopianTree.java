package HackerRank;
import java.util.*;
class UtopianTree
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }       
        HashMap<Integer,Integer> hm=new HashMap<>();
        int height=0;
        for(int i=0;i<=max;i++)
        {
            if(i==0)
            {
                height=1;
            }
            if(i%2!=0)
            {
                height=height*2;
            }
            if(i%2==0 && i!=0)
            {
                height=height+1;
            }
            hm.put(i, height);
        }
        for(int a:arr)
        {
            System.out.println(hm.get(a));
        }
        sc.close();    
    }
}
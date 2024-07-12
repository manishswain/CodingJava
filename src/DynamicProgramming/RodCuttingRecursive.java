package DynamicProgramming;

public class RodCuttingRecursive
{
    public static void main(String[] args) 
    {
        int length[]={1,2,3,4,5,6,7,8};
        int price[]={1,5,8,9,10,17,17,20};
        int maxlen=8;
        int profit=findProfit(length,price,maxlen,length.length);
        System.out.println(profit);
    }

    private static int findProfit(int[] length, int[] price, int maxlen,int n) 
    {
        if(n==0 || maxlen==0)
        {
            return 0;
        }
        else if(length[n-1]<=maxlen)
        {
            return Math.max(price[n-1]+findProfit(length, price, maxlen-length[n-1], n), findProfit(length, price, maxlen, n-1));
        }
        else 
            return findProfit(length, price, maxlen, n-1);
    }    
}
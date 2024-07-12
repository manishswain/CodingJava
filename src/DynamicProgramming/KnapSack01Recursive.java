package DynamicProgramming;

public class KnapSack01Recursive 
{
    public static void main(String[] args) 
    {
        int val[]={359, 963, 465, 706, 146, 282, 828, 962, 492};// These are the values which will be put in the sack.
        int wt[]={96, 43, 28, 37, 92, 5, 3, 54, 93};//These are the corresponding values of the given weights
        int weight=383;//Knapsack Capacity

        int n=wt.length;
        long start=System.currentTimeMillis();
        int fval=knapSack(wt,val,weight,n);//Passing the weight array and value array with the cappacity.
        System.out.println(fval);    
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }  

    private static int knapSack(int[] wt, int[] val, int weight, int n) 
    {
        //Most important base Case
        if(n==0 || weight==0)//When we have completely processed the weigth array or we have completed filling items in the Knapsack.
        {
            return 0;//When we nothing we should return
        }
        if(wt[n-1]<=weight)//When the current weight is less than the knapsack capacity then we should consider taking it.
        {
            return Math.max(val[n-1]+knapSack(wt, val, weight-wt[n-1], n-1),knapSack(wt, val, weight, n-1));
            // val[n-1]+knapSack(wt, val, weight-wt[n-1], n-1
            /* this will consider that item and add value of that item to knapsack and calls the same function for less no of weights.
            Imp-Here our work is to think just we have to take the element or not.

            knapSack(wt, val, weight, n-1)->It means we are not considering the current item and calling the function on the smaller input.
            */
            
        }
        //if the weight is larger than the knapsack then also call the function for processing the further element.
        return knapSack(wt, val, weight, n-1);
    }
}
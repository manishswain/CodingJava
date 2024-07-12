package Recursion;

public class StringPermutaion 
{
    static int stepcount=0;
    public static void main(String[] args) 
    {
        int res=permute("42",0,1); 
        //System.out.println(stepcount);  
        System.out.println(res); 
    }
    static int sum=0;
    static final int M = 1000000007;
    private static int permute(String s, int l, int r) 
    {
        stepcount++;
        if(l==r)
        {
            sum=(sum+Integer.valueOf(s))%M;
        }

        for(int i=l;i<=r;i++)
        {
            s=swap(s,l,i);
            permute(s, l+1, r);
            s=swap(s,l,i);
        }
        return sum;
    }

    private static String swap(String s, int l, int i) 
    {
        char ch[]=s.toCharArray();
        char temp=ch[l];
        ch[l]=ch[i];
        ch[i]=temp;
        return String.valueOf(ch);
    }
}
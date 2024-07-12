package Codevita;
import java.util.*;
import java.io.*;
public class BinaryEquivalent 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(sc.nextInt());
        }       
        int arr[]=set.parallelStream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        int brr[]=new int[n];
        int m=Integer.toBinaryString(arr[n-1]).length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            brr[i]=binaryFinder(arr[i]);
            ans+=brr[i];
        }
        int finalans=setFinder(ans,m);
        System.out.println(String.format("%"+m+"s",Integer.toBinaryString(finalans)).replaceAll("\\s","0"));
    } 
    
    private static int setFinder(String ans, int m) 
    {
        int len = ans.length();  
        int temp = 0;   
        String arr[] = new String[len*(len+1)/2];  
        int countf=0,flag=0,sum=0; 
        for(int i = 0; i < len; i++) 
        {  
            flag=0;sum=0; 
            for(int j = i; j < len; j++) {  
                arr[temp] = ans.substring(i, j+1);  
                temp++;  
            }
            temp--;
            String str=arr[temp];  
            int n=str.length();
            for(int k=0;k<n;k++)           
            {
                sum+=(int)str.charAt(k)-48;
                flag+=m;
                //System.out.println(sum+" "+flag);
                if(flag-sum==sum)
                {
                countf++;    
                }   
            }
            
            temp++;
        } 
        //System.out.println(Arrays.toString(arr));
        return countf;
    }

    private static int binaryFinder(int n) 
    {
        int m=0,count=0;
        String x="";
        while(n > 0)
        {
            m=n%2;
            if(m == 1)
            {
                count++;
            }
            x = m+""+x;
            n = n / 2;
        }
        return count;
    }


   
}
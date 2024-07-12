package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationArrayList 
{
    public static void main(String[] args) 
    {
        Integer arr[]={1,2,3,4,5};
        List<Integer> ip=new ArrayList<>(Arrays.asList(arr));
        List<Integer> op=new ArrayList<>();
    
        solve(ip,op);
    }

    private static void solve(List<Integer> ip, List<Integer> op) 
    {
        if(ip.size()==0)
        {
            System.out.println(op);
            return;
        }
        List<Integer> out1=op;
        List<Integer> out2=op;
        out2.add(ip.get(0));
        ip.remove(0);

        solve(ip, out1);
        solve(ip, out2);

    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out2 += input.charAt(0);
        input = input.substring(1);

        solve(input,out1);
        solve(input,out2);
    }
}

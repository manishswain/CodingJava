package Recursion;

public class PermutationWithSpaces 
{
    public static void main(String[] args) 
    {
        String ip=new String("abc");
        String op=new String("");
        op+= ip.charAt(0);
        ip=ip.substring(1);      
        solve(ip,op);
    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out2 += input.charAt(0);
        out1+=" "+input.charAt(0);
        input = input.substring(1);

        solve(input,out1);
        solve(input,out2);
    }
}

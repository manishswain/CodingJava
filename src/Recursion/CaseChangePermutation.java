package Recursion;

public class CaseChangePermutation
{
    public static void main(String[] args) 
    {
        String ip=new String("abc");
        String op=new String("");
        
        solve(ip,op);
    }

    private static void solve(String input, String output) {
        if(input.length()==0){
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output;
        out1 +=input.charAt(0);
        out2 += Character.toUpperCase(input.charAt(0));
        input = input.substring(1);

        solve(input,out1);
        solve(input,out2);
    }    
}

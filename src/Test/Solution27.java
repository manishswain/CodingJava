package Test;
public class Solution27 {

static boolean Arrive(int a, int b, int n)
{
    if (n >= Math.abs(a) + Math.abs(b) && (n - (Math.abs(a) + Math.abs(b))) % 2 == 0)
        return true;
 
    return false;
} 
    public static void main (String[] args) {
         
    int a = 1, b = 3, n = 5;
 
    if (Arrive(a, b,n))
        System.out.println( "Yes");
    else
        System.out.println( "No");
    }
}
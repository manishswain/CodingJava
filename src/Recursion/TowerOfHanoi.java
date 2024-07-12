package Recursion;
public class TowerOfHanoi 
{
    public static void main(String[] args) 
    {
        int n=3;
        char a='a';char b='b';char c='c';

        solve(a,c,b,n);
            
    }

    private static void solve(char a, char c, char b, int n) 
    {
        if(n==1)
        {
            System.out.println("Moving "+n+" from "+a+" to "+c);
            return;
        }
        solve(a, b, c, n-1);
        System.out.println("Moving "+n+" from "+a+" to "+c);
        solve(b, c, a, n-1);

        return;
    }
}

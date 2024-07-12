package Test;

import java.util.*;

public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() != 6) {
            System.out.println("Invalid Input");
            return;
        }
        char ch[] = str.toCharArray();
        char c = ch[0];
        if(!(c=='N' || c=='E'|| c=='W'|| c=='S'))
        {
            System.out.println("Invalid Gate Name");
            return;
        }
        char d = ch[1];
        if(!(d=='A' || d=='B'|| d=='C'|| d=='D'|| d=='E'|| d=='F'))
        {
            System.out.println("Invalid Block Name");
            return;
        }
        char e = ch[2];
        if(!(e=='1' || e=='2'|| e=='3'|| e=='4'))
        {
            System.out.println("Invalid Floor Number");
            return;
        }
        String s = str.substring(3,6);
        int num=Integer.parseInt(s);
        if(!(num>=1 && num<=500))
        {
            System.out.println("Invalid Seat Number");
            return;
        }
        System.out.println("Gate "+c);
        System.out.println("Block "+d);
        System.out.println("Floor "+e);
        System.out.println("Seat "+num);
    }
}

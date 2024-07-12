package Codevita;
import java.util.*;

public class GoldIngot 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String temp=sc.nextLine();
        while(!(temp.length()==0))
        {
            int t=Integer.parseInt(temp);
            list.add(t);
            temp=sc.nextLine();
        }
        System.out.println(list);
        sc.close();
    }
}
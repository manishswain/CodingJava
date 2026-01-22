package EDUDiv2101;

import java.util.ArrayList;

public class B 
{
    public static void main(String[] args) {
        ArrayList<String> my=new ArrayList<>();

        my.add("C");
        my.add("H");

        ArrayList<String> my1=new ArrayList<>();

        my1.add("C");
        my1.add(1,"H");

        System.out.println(my.equals(my1));


    }    
}

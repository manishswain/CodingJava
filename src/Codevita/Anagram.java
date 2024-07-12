package Codevita;
import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) 
    {
        String str1 = "difficult";
        String str2 = "luafftlcb";

        HashMap<Character,Integer> map2 = new HashMap<>();

        int count = 0;

        for(int i=0 ; i<str2.length(); i++)
        {
            if(!map2.containsKey(str2.charAt(i)))
                map2.put(str2.charAt(i),1);
            else
                map2.put(str2.charAt(i), map2.get(str2.charAt(i))+1);
        }

        for(int i=str1.length()-1 ; i>=0 ; i--)
        {
            if(map2.containsKey(str1.charAt(i)) && map2.get(str1.charAt(i)) > 0)
            {
                count++;
                map2.put(str1.charAt(i), map2.get(str1.charAt(i))-1);
            }
            else
                break;
        }

        System.out.println(str1.length() - count + str2.length() - count);

    }
}
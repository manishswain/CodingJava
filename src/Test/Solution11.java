package Test;
import java.util.*;
 
public class Solution11 {


    public static String decrypt(String input1)
    {         
        StringBuffer result= new StringBuffer();
        for (int i=0; i<input1.length(); i++)
        {
            if (Character.isUpperCase(input1.charAt(i)))
            {
                char ch = (char)(((int)input1.charAt(i) +3 - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)input1.charAt(i) +3 - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return new String(result);
    }
    // Driver code
    public static void main(String[] args)
    {
        String input1 = "nrfzh";
        System.out.println("Cipher: " + decrypt(input1));
    }
}
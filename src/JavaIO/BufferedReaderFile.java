package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReaderFile 
{
    public static void main(String[] args) throws Exception
    {
        String thisLine = null;
      
      try {
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader(new FileReader("D:/java/CompetetiveProgramming/src/JavaIO/9MAR.txt"));
         
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
         }   
         br.close();    
      } catch(Exception e) {
         e.printStackTrace();
      }
      
    }    
}
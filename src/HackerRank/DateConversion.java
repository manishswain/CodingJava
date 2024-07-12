package HackerRank;
import java.util.*;
import java.io.*;
public class DateConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String ar[]=s.split(":");
        StringBuilder sb=new StringBuilder(s);
        if(s.contains("AM"))
        {
            return new String(sb.delete(9,11));
        }
        else
        {
            String s1=String.valueOf(Integer.parseInt(ar[0]+12));
            return new String(s1+new String(sb.delete(3,11)));
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

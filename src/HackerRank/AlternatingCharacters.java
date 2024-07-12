
package HackerRank;
import java.util.*;
public class AlternatingCharacters {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			int res=alternatingCharacters(s);
			System.out.println(res);
        }
        sc.close();
	}
    static int alternatingCharacters(String s) 
    {
        int flag=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                flag++;
            }
        }
        return flag;
    }
}

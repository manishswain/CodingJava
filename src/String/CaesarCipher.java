package String;
import java.util.Scanner;

public class CaesarCipher 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        String str=sc.next();
        int K=sc.nextInt();
        int k=K%26;
        //System.out.println(n+str+k);
        char[] chs=new char[26];int j=0;
        for(int i=0;i<26;i++)
        {
            if(97+k+i>122)
            {
                chs[i]=(char)(97+(j++));
            }
            else
                chs[i]=(char)(97+k+i);
        }
        char[] chb=new char[26];int l=0;
        for(int i=0;i<26;i++)
        {
            if(65+k+i>90)
            {
                chb[i]=(char)(65+(l++));
            }
            else
                chb[i]=(char)(65+k+i);
        }
        //System.out.println(Arrays.toString(chb));
        for(int i=0;i<n;i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                System.out.print(chs[(int)str.charAt(i)-'a']);
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                System.out.print(chb[(int)str.charAt(i)-'A']);
            }
            else 
            System.out.print(str.charAt(i));
        }
        sc.close();    
    }    
}
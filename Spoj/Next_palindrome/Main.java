/** This program demonstrates that if there is repetition of the element or not in a given string
*/
import java.util.*;
import java.io.*;
public class Main
{
 
    private static boolean isnine(String hel)
    {
        for(int i=0;i<hel.length();i++)
        {
            if(hel.charAt(i)!='9')
                return false;
 
        }
        return true;
    }
    private static String addandprint(String hel,int add)
    {
        int stop=(hel.length()%2==0)? -1:0;
        int j=hel.length()/2;
        char arr[]=hel.toCharArray();
        for(int i=j+stop;i>=0;i--)
        {
            int temp=arr[i]-'0'+add;
            arr[i]=(char)(temp%10+48);
            arr[hel.length()-1-i]=arr[i];
            add=temp/10;
 
        }
        return new String(arr);
    }
    private static boolean rightislarge(String hel)
    {
        int stop=(hel.length()%2==0)? -1:0;
        int j=hel.length()/2;
        char arr[]=hel.toCharArray();
        for(int i=j+stop;i>=0;i--)
        {
           if((int)arr[i]<arr[hel.length()-1-i])
               return  true;
        }
        return false;
    }
 
    private static void solve(String hel)
    {
         if(isnine(hel))
            {
                StringBuilder nine=new StringBuilder("1");
                for(int i=0;i<hel.length()-1;i++)
                {
                    nine.append("0");
 
                }
                nine.append("1");
                System.out.println(nine);
                return;
            }
        else if(hel.equals(new StringBuilder(hel).reverse().toString())|| rightislarge(hel))
        {
            System.out.println(addandprint(hel,1));
        }
        else
        {
            System.out.println(addandprint(hel,0));
        }
    }
    public static void main(String args[]) throws IOException
    {
        Scanner s=new Scanner(System.in);
         int t=s.nextInt();
         while(t-->0)
         {
         	solve(s.next());
         }
 
    }
}
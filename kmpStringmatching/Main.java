import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a text ");
        String text = in.next();
        System.out.println("enter a pattern");
        String pattern = in.next();
        findsubstring(text, pattern);
    }
    private static void findsubstring(String arr, String hel)
    {
        int lps[] = compute(hel);
        int i = 0;
        int j = 0;
        while(i < arr.length())
        {
            if(arr.charAt(i) == hel.charAt(j))
            {
                i++;
                j++;
            }
            else if(arr.charAt(i) != hel.charAt(j))
            {
                if(j > 0)
                    j = lps[j - 1];
                else
                    i++;
            }
            else if(j == hel.length())
            {
                System.out.println("match found at index " + (i - j));
                j = lps[j - 1];
            }
        }
    }
    private static int[] compute(String arr)
    {
        int i = 1;
        int j = 0;
        int lps[] = new int[arr.length()];
        lps[0] = 0;
        for(;i < lps.length;)
        {
            if(arr.charAt(i) == arr.charAt(j))
            {
                lps[i] = j + 1;
                i++;
                j++;
            }
            else
            {
                if(j > 0)
                {
                    j = lps[j - 1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
 }
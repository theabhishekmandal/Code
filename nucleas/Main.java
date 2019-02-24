import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
import javax.script.*;
public class Main
{
    public static void main(String args[]) throws Exception
    {
        int arr[] = new int[9];
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = i + 1;
        foo(arr, 1,"1",1);
    }
    static void foo(int arr[], int i, String output, long ans) throws Exception
    {

        if( ans == 100 && i == arr.length)
        {
                out.println(output + "=100");
            return;
        }
        else if(i < arr.length)
        {

            foo(arr, i + 1, output + "" + arr[i],getval(ans, output, arr, i));
            foo(arr, i + 1, output + "+" + arr[i],ans + arr[i]);
            foo(arr, i + 1, output + "-" + arr[i],ans - arr[i]);
        }
    }
    // to calculate value of the expression if nothing is placed between digits
    static long getval(long ans, String output, int[] arr, int i)
    {
        String nums[] = output.split("\\D");
        String oper[] = output.split("\\d");

        if(oper.length > 0 && oper[oper.length - 1].equals("+"))
        {
            int save = Integer.parseInt(nums[nums.length - 1]);
            return  ((ans - save) + (save * 10 + arr[i]));
        }

        else if(oper.length > 0 && oper[oper.length - 1].equals("-")) {
            int save = Integer.parseInt(nums[nums.length - 1]);
            return ((ans + save) - (save * 10 + arr[i]));
        }

        return (ans * 10 +arr[i]);
    }

}

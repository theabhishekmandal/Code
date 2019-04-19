import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main
{
    static long start;
    static long stop;
    static int maxint = Integer.MAX_VALUE;
    static int minint = Integer.MIN_VALUE;
    static void debug(Object... a)
    {
    	err.println(Arrays.deepToString(a));
    }
    static void starttime(){start = currentTimeMillis();}
    static void stoptime(){stop = currentTimeMillis();}
    static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}
    static class FastReader
    {
    StringTokenizer st;
    BufferedReader br;
    FastReader()
    {
        br = new BufferedReader(new InputStreamReader(in));
    }
    String n()
	{
        while(st == null || !st.hasMoreElements())
	{
	    try
	    {
	    st = new StringTokenizer(br.readLine());
	    }
	    catch(Exception e)
	    {
	    e.printStackTrace();
	    }
	}
	    return st.nextToken();
    }

    int ni()
    {
        return Integer.parseInt(n());
    }
    float nf()
    {
        return Float.parseFloat(n());
    }

    double nd()
    {
        return Double.parseDouble(n());
    }

    long nl()
    {
        return Long.parseLong(n());
    }
    String ns()
    {
        String k="";
	    try
        {
	       k = br.readLine();
        }
        catch(Exception e)
        {

	       e.printStackTrace();
        }
        return k;

    }
  }
    public static void main(String args[]) throws IOException
    {
		FastReader in = new FastReader();
	//	int t = in.ni();
	//	for(int test = 1; test <= t; test++)
	//	{
            solve(in); //, test);
    //  }
    }
     static void solve(FastReader in)
    {
        int n = in.ni();
        int height[]= new int[n];
        int position[]= new int[n];
        for(int i = 0 ; i < position.length ; i++)
            position[i] = in.ni();
        for(int i = 0 ; i < height.length ; i++)
            height[i] = in.ni();
        out.println(checkall(n, position, height));

    }
    static String checkall(int n, int[] position, int[] height)
    {
        String none = "NONE";
        String left = "LEFT";
        String right = "RIGHT";
        String both = "BOTH";
        int count = 1;
        int count1 = 1;
        for(int i = 1; i < height.length; i++)
        {
            int res = height[i - 1] + position[i - 1] - position[i];
            if(res < 0)
                break;
            else
            {
                int add = (res - height[i] > 0)? res - height[i]:0;
                height[i] += add;
                count++;
            }
        }
        for(int i = height.length - 2; i >= 0; i--)
        {
            int res = position[i + 1] - height[i + 1] - position[i];
            if(res < 0)
                break;
            else
            {
                int add = (res - height[i] > 0)? res - height[i] : 0;
                height[i] += add;
                count1++;
            }
        }
        debug(count);
        debug(count1);
        if(count == n || count1 == n)
        {
            if(count > count1)
                return right;
            if(count < count1)
                return left;
            else
                return both;

        }
        return none;
    }
    
 }

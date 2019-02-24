import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class Main
{
    private static PrintWriter out = new PrintWriter(System.out,true);
    private static PrintWriter err = new PrintWriter(System.err,true);
    private static long start;
    private static long stop;
    private static int maxint = Integer.MAX_VALUE;
    private static int minint = Integer.MIN_VALUE;
    private static void debug(Object... a)
    {
    	err.println(Arrays.deepToString(a));
    }
    private static void starttime()
    {
    	start = System.currentTimeMillis();
    }
    private static void stoptime()
    {
    	stop = System.currentTimeMillis();
    }
    private static void gettime()
    {
    	out.println(stop - start);
    }

    static class FastReader
    {
    StringTokenizer st;
    BufferedReader br;
    FastReader()
    {
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    String n()
	{
        while(st==null||!st.hasMoreElements())
	{
	    try
	    {
	    st=new StringTokenizer(br.readLine());
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
	       k=br.readLine();
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
		int t = in.ni();
		for(int test = 1; test <= t; test++)
		{
            solve(in); //, test);
    	}
    }
    private static void solve(FastReader in)
    {
        int n = in.ni();
        int k = in.ni();
        String hel = in.n();
        int cap = 0;
        int small = 0;
        for(int i = 0 ; i < hel.length(); i++)
        {
        	char temp = hel.charAt(i);
        	if(temp <= 'Z' && temp >= 'A')
        		cap++;
        	else if(temp <= 'z' && temp >= 'a')
        		small++;
        }
        if(small <= k && cap <= k)
        {	
        	out.println("both");
        	return;
        }
        if(cap > k && small > k)
        {
        	out.println("none");
        	return;
        }
        if(cap <= k)
        	out.println("chef");
        else if(small <= k)
        	out.println("brother");
        	
    }
    
 }
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
    private static int maxvalue = Integer.MAX_VALUE;
    private static int minvalue = Integer.MIN_VALUE;

    @SuppressWarnings({"unchecked", "varargs"})
    private static <T> void debug(T... a)
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
    String next()
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

    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }
    String nextLine()
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
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t-- > 0)
		solve(s);
    }
    private static void solve(FastReader s)
    {
    	int n = s.nextInt();
    	long R = s.nextLong();
    	long arr[] = new long[n];
    	for(int i = 0; i < arr.length; i++)
    	{
    	    arr[i] = s.nextLong();
    	}
    	String save = "YES";
    	long l = 0;
    	long r = Long.MAX_VALUE;
    	for(int i = 0 ;i < arr.length - 1; i++)
    	{
    	    if(l > arr[i] || arr[i] > r)
    	    {
    		save = "NO";
    		break;
    	    }
    	    else if(R < arr[i])
    		    r = arr[i];
	    else
		l = arr[i];
	}
	out.println(save);
    	
    }
}
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
    	int arr[] = new int[4];
    	for(int i = 0; i < arr.length; i++)
    	{
    	    arr[i] = s.nextInt();
    	}
    	
    	Arrays.sort(arr);
    	int count = 0;
    	if((arr[0] != arr[1]) || (arr[2] != arr[3]))
    	{
    	    out.println("NO");
    	    return;
    	}
    	out.println("YES");
    	    
    }
}
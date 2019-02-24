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
		FastReader s = new FastReader();
		solve(s);
    }
    private static void solve(FastReader s)
    {
       int n = s.ni();
       int arr[] = new int[n + 1];
       for(int i = 1 ; i < arr.length; i++)
            arr[i] = s.ni();
        boolean visited[] = new boolean[n + 1];
        for(int i = 1; i < arr.length; i++)
        {
            if(!visited[i])
                {
                    int store[] = new int[n + 1];
                    store[0] = i;
                    visited[i] = true;
                    path(arr, visited, arr[i], i, store, 1);
                }
        }
        out.println(count);
        out.println(br);

    }
    static int count = 0;
   	static StringBuilder br = new StringBuilder();
    private static void path(int[] arr,boolean[] visited, int src, int des, int[] store, int i)
    {
        store[i] = src;
        visited[src] = true;
        if(src == des)
        {
        	count++;
            for(int k = 0 ; k <= i ; k++)
                br.append(store[k]).append(' ');
            br.append('\n');
        }
        else
        {
            path(arr, visited, arr[src], des, store, i + 1);
        }
    }
    
 }
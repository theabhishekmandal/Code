import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class Main
{
    private static PrintWriter out = new PrintWriter(System.out,true);
    private static PrintWriter err = new PrintWriter(System.err,true);
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
    	int arr[] = new int[n + 1];
    	int min = Integer.MAX_VALUE;
    	int index = -1;
    	for(int i = 1 ;i < arr.length ;i++)
    		{
    			arr[i] = s.nextInt();
    			if(arr[i] < min)
    				{
    					min = arr[i];
    					index = i;
    				}
		    }
		    out.println(index);		
    }
}
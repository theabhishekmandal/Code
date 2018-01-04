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
    // this is wrong
    private static void solve(FastReader s) throws IOException
    {
    	int n = s.nextInt();
    	int m = s.nextInt();
    	StringBuilder br = new StringBuilder();
    	for(int i = 0; i < n ;i++)
    	{	
    			br.append(s.next());	
    	}
    	int one = 0;
    	int two = 0;
    	String cake = br.toString();
    	for(int i = 0; i < cake.length() ;i++)
    	{
    		if(i % 2 == 0 && cake.charAt(i) == 'R')
    			one += 5;
    		else if(i % 2 != 0 && cake.charAt(i) == 'G')
    			one += 3;
    	}
    	for(int i = 0; i < cake.length() ;i++)
    	{
    		if(i % 2 == 0 && cake.charAt(i) == 'G')
    			two += 3;
    		else if(i % 2 != 0 && cake.charAt(i) == 'R')
    			two += 5;
    	}
    	out.println(Math.min(one, two));
    }
}
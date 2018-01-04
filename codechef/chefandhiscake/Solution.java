import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
class Solution
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
    	int m = s.nextInt();
    	char arr[][] = new char[n][m];
    	for(int i = 0 ; i < n ; i++)
    	{
    		String cake = s.next();
    		for(int j = 0; j < m; j++)
    		{
    			arr[i][j] = cake.charAt(j);
    		}
    	}
    	int one = 0;
    	int two = 0;
    	for(int i = 0 ; i < n ; i++)
    	{
    		for(int j = 0; j < m; j++)
    		{
    			if((i + j) % 2 == 0 && arr[i][j] == 'G')
    				one += 3;
    			if((i + j) % 2 != 0 && arr[i][j] == 'R')
    				one += 5;
    		}
    	}
    	for(int i = 0 ; i < n ; i++)
    	{
    		for(int j = 0; j < m; j++)
    		{
    			if((i + j) % 2 == 0 && arr[i][j] == 'R')
    				two += 5;
    			if((i + j) % 2 != 0 && arr[i][j] == 'G')
    				two += 3;
    		}
    	}
    	out.println(Math.min(one, two));
    }
}
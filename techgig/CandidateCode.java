import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class CandidateCode
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
    private static long start = 0;
    private static long stop = 0;
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
    public static void main(String args[]) throws IOException
    {
		FastReader s = new FastReader();
		// int t = s.nextInt();
		//while(t-- > 0)
		solve(s);
    }
    private static void solve(FastReader s)
    {
        starttime();
    	int n = s.nextInt();
    	int m = s.nextInt();
    	TreeMap<Integer, Integer> arr = new TreeMap<>();
    	for(int i = 0; i < n ; i++)
    	{
    		int one = s.nextInt();
    		int two = s.nextInt();
    		for(int j = one; j <= two ; j++)
    		{
    			if(arr.get(j) == null)
    				arr.put(j, 1);
    			else
    				arr.put(j, arr.get(j) + 1);
    		}
    	}
    	int p = s.nextInt();
    	int max = Integer.MIN_VALUE;
    	int max2 = Integer.MIN_VALUE;
    	int save = -1;
    	for(int i = arr.size() - 1; i >= 0 ;i--)
    	{
    		  int key = (Integer)arr.keySet().toArray()[i];
    		  if(arr.get(key) > max )
    		  {
    		  	max = arr.get(key);
    		  }
    		  if(arr.get(key) == p && key > max2)
    		  {
    		  	max2 = key;
    		  	save = key; 	
    		  }
    	}
    	out.println(max + " " + save);
    	stoptime();
    	gettime();
    }
}                         	
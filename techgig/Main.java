import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
class Main
{
    private static PrintWriter out = new PrintWriter(System.out,true);
    private static PrintWriter err = new PrintWriter(System.err,true);
    private static long start;
    private static long stop;
    private static int maxvalue = Integer.MAX_VALUE;
    private static int minvalue = Integer.MIN_VALUE;
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
		// int t = s.nextInt();
		//while(t-- > 0)
		solve(s);
    }
    private static void solve(FastReader s)
    {
    	 int n = s.nextInt();
	     int k = s.nextInt();
    	 int min = maxvalue;
    	 int max = minvalue;
    	 int hel[] = new int[1000000 + 1];
    	 for(int i = 0; i < n; i += 1)
    	 {
    	 	int one, two;
    	 	one = s.nextInt();
    	 	two = s.nextInt();
		int j = one;
    	 	while(j <= two)
    	 		{
    	 			hel[j++]++;
    	 		}
    	 	if(one < min)
    	 		min = one;
    	 	if(two > max)
    	 		max = two;
    	 }
    	 int p = s.nextInt();
	 int val = minvalue;
	 int val2 = minvalue;
	 int save = -1;
    	 for(int i = min ; i <= max ;i++)
    	 {
    	 	 if(hel[i] > val)
    	 	 {
    	 	 	val = hel[i];
    	 	 }
    	 	 if(hel[i] == p && i > val2)
		 {
			save = val2 = i;
		 }
    	 }
	 out.println(val + " " + save);
    	 
    }
}

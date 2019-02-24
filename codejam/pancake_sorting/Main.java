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
		FastReader s = new FastReader();
		int t = s.ni();
		int i = 1;
		while(t-- > 0)
			{
				solve(s,i);
				i += 1;
			}	
    }
    private static void solve(FastReader s, int l)
    {
     	char[] hel = s.n().toCharArray();
     	int k = s.ni();
     	int count = 0;
     	for(int i = 0 ; i < hel.length - k + 1; i++)
     	{
     		if(hel[i] == '-')
     		{
     			count++;
     			for(int j = 0 ; j < k; j++)
     			{
     				if(hel[i + j] == '-')
     					hel[i + j] = '+';
     				else
     					hel[i + j] = '-';
     			}
     		}
     	}
     	boolean check = true;
     	for(int i = 0 ; i < hel.length ; i++)
     	{
     		if(hel[i] == '-')
     		{
     			check = false;
     			break;
     		}
     	}
     	if(check)
     		out.println("Case #" + l + ": " + count);
     	else
     		out.println("Case #" + l + ": " + "IMPOSSIBLE");
    }
    
 }

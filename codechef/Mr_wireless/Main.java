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
    public static void main(String args[])
    {
	FastReader s = new FastReader();
	try{
	long large = 8589934592L;
	int t = s.nextInt();
	int i=1;
	while(t-- > 0)
	{
	    String num = s.next();
	    String save = "Case "+i+": ";
	    if (new BigInteger(num).compareTo(new BigInteger("33")) == -1)
		out.println(save + ((long)Math.pow(2,Long.parseLong(num)) - 1));
	    else 
		out.println(save+(large - 1));
		i++;
	}
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
}
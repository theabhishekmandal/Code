import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main
{
    static long start;
    static long stop;
    static int maxint = Integer.MAX_VALUE;
    static int minint = Integer.MIN_VALUE;
    static void debug(Object... a)
    {
    	err.println(Arrays.deepToString(a));
    }
    static void starttime(){start = currentTimeMillis();}
    static void stoptime(){stop = currentTimeMillis();}
    static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}
    static class FastReader
    {
    StringTokenizer st;
    BufferedReader br;
    FastReader()
    {
        br=new BufferedReader(new InputStreamReader(in));
    }
    String n()
	{
        while(st == null || !st.hasMoreElements())
	{
	    try
	    {
	    st = new StringTokenizer(br.readLine());
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
	       k = br.readLine();
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
		FastReader in = new FastReader();
		//int t = in.ni();
		//for(int test = 1; test <= t; test++)
		//{
            solve(in); //, test);
          //}
    }
     static void solve(FastReader in)
     {
        int k = in.ni();
        int n = in.ni();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length; i++)
            arr[i] = in.ni();
        boolean visit[] = new boolean[arr.length];
        boolean valid;
        for(int i = 0 ; i < arr.length; i++)
        {
            valid = true;
            if(!visit[i])
            {
                int sum = 0;
                int step = 0;
                int j = i;
                while(j < arr.length)
                {
                    sum += arr[j];
                    visit[j] = true;
                    step++;
                    j += k;
                }
                valid = isvalidprime(sum, step);
            }
            if(!valid)
            {
                out.println(-1);
                return;
            }            
        }
        out.println(1);
     }
     static boolean isvalidprime(int n, int k)
     {
        if(n < 2 * k)
            return false;
        if(k == 1)
            return isprime(n);
        if(k == 2)
        {
            if((n & 1) == 0)
                return true;
            else
                return isprime(n - 2);
        }
        // for  k >= 3
        return true;
     }
    static boolean isprime(int n)
    {
        if(n < 2) return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        else
        {
            for(int i = 5; i * i <= n ; i += 6)
            {
                if(n % i == 0 || n % (i + 2) == 0 )
                    return false;
            }
        }
        return true;
    }
    
 }

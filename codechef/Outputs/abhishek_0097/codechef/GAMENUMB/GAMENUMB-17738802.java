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
        br = new BufferedReader(new InputStreamReader(in));
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
		int t = in.ni();
		for(int test = 1; test <= t; test++)
	//	{
            solve(in); //, test);
    //  }
    }
     static void solve(FastReader in)
    {
        try{
        int n = in.ni();
        int k = in.ni();
        int a[] = new int[n];
        int d[] = new int[n];
        int b[] = new int[k];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < a.length; i++)
            a[i] = in.ni();
        for(int i = 0; i < d.length; i++)
            d[i] = in.ni();
        for(int i = 0; i < b.length; i++)
            b[i] = in.ni();
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d[i]; j++){
                arr.add(a[i]);
            }
        }
        Collections.sort(arr);
        int start = 0;
        int end = arr.size();
        int length = arr.size();
        for(int i = 0 ; i < b.length; i++){
            if(i % 2 == 0){
                start = end - b[i];
            }
            else{
                end = start + b[i];
            }
        }
        long sum = 0;
        for(int i = start; i < end; i++)
            sum += arr.get(i);
        out.println(sum);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
 }
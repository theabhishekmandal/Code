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
            solve(s, i);
            i++;
     	 }
    }
    private static void solve(FastReader s, int l)
    {
       String hel = s.n();
       String nine = "99999999999999999999999999999999999999999999";
       if(hel.length() == 1)
       		out.println("Case #" + l + ": " + hel);
       else if(isalloneandzero(hel))
       {
       		//debug("blah", hel);
       		 out.println("Case #" + l + ": " + nine.substring(0, hel.length() - 1));
       }
       else
       {
       		char arr[] = hel.toCharArray();
       		//debug("hell yeah", arr);
       		for(int i = 0 ; i < arr.length - 1; i++)
       		{
       			if(arr[i] < arr[i + 1])
       				continue;
       			else if(arr[i] > arr[i + 1])
       			{
       				//debug("hello",arr);
                call(arr, i);
       					break;
       			}
       			else if(arr[i] == arr[i + 1])
       			{
       				//debug("world",arr);
       				int count = i + 1;
       				while(count < arr.length && arr[i] == arr[count]) 
       				count++;
       				if(count == arr.length)
       				{
       					break;
       				}
       				else if(arr[i] > arr[count])
       				{
                		call(arr, i);
       			    	break;
       				}
       			}
       		}
       		String  save = new String(arr);
       		out.println("Case #" + l + ": " + ((save.charAt(0) == '0')? save.substring(1): save));
       }
    }
    private static void call(char[] arr, int i)
    {
        arr[i]--;
        for(int k = i + 1 ; k < arr.length; k++)
          arr[k] = '9';
    }
    private static boolean isalloneandzero(String one)
    {
    	for(int i = 0 ; i < one.length() - 1; i++)
    	{
    		char ch = one.charAt(i);
    		if(ch != '1' ||  ch != '0')
    		return false;
    	}
    	return true;
    }   
 }
                                                                         
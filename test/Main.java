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
	@SuppressWarnings({"unchecked", "varargs"})
    private static <T> void debug(T... a)
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
        //int t = s.ni();
        //while(t-- > 0)
        solve(s);
    }
    private static int[] arr = new int[10000001];
    private static void solve(FastReader s)
    {
        int n = s.ni();
        int arr[] = new int[n];
        Integer save[][] = new Integer[arr.length][2];
        for(int i = 0 ; i < arr.length ; i++)
            arr[i] = s.ni();
        for(int i = 0 ; i < arr.length ; i++)
        {
            save[i][0] = i;
            save[i][1] = arr[i];
        }
        Arrays.sort(save, new Comparator<Integer[]>(){
            public int compare (Integer[] one, Integer[] two)
            {
                Integer hel = one[1];
                Integer hel2 = two[1];
                return hel.compareTo(hel2);
            }

        });
        out.println(Arrays.deepToString(save));
    }
    
 }

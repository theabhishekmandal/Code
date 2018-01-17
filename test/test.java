import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class test
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
    private static void starttime(){start = System.currentTimeMillis();}
    private static void stoptime(){stop = System.currentTimeMillis();}
    private static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}
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
		FastReader in = new FastReader();
	//	int t = in.ni();
	//	for(int test = 1; test <= t; test++)
	//	{
            solve(in); //, test);
    //  }
    }
    private static void solve(FastReader in)
    {
        int n = in.ni();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length; i++)
            arr[i] = in.ni();
        heapsort(arr);
        out.println(Arrays.toString(arr));
    }
    private static void heapsort(int[] arr)
    {
        buildmaxheap(arr, arr.length);
        for(int i = arr.length - 1; i >= 0 ; i--)
        {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
        }
    }
    private static void buildmaxheap(int[] arr, int len)
    {
        for(int i = (int)Math.floor(len / 2); i >= 0 ; i-- )
            heapify(arr, i, len);
    }
    private static void heapify(int arr[],int i, int len)
    {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if(l < len && arr[l] > arr[i])
            largest = l;
        if(r < len && arr[r] > arr[largest])
            largest = r;
        if(i != largest)
        {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, largest, len);
        }
    }
    
 }

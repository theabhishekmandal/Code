import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class Main
{
    private static PrintWriter out = new PrintWriter(System.out,true);
    private static PrintWriter err = new PrintWriter(System.err,true);
    private static void debug(Object... a)
    {
    	err.println(Arrays.deepToString(a));
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
    	 int arr[] = new int[n];
    	 for(int i = 0; i < arr.length; i++)
    	 	arr[i] = s.nextInt();
    	 heapsort(arr);
    	 out.println(Arrays.toString(arr));
    }
    private static void heapsort(int[] arr)
    {
    	BuildMaxheap(arr, arr.length - 1);
    	for(int i = arr.length - 1 ; i >= 1 ; i--)
    		{
    			int temp = arr[0];
    			arr[0] = arr[i];
    			arr[i] = temp;
    			max_heap(arr, 0, i);
    		}
    }
    private static void BuildMaxheap(int[]  arr, int length)
    {
    	for(int i = (int)Math.floor(length / 2); i >= 0 ; i--)
    		max_heap(arr, i, length);
    }
    private static void max_heap(int arr[], int i, int length)
    {
    	int l = 2 * i + 1;
    	int r  = 2 * i + 2;
    	int largest = i;
    	if(l < length && arr[l] > arr[i])
    		largest = l;
    	if(r < length && arr[r] > arr[largest])
    		largest = r;
    	if(i != largest)
    		{
    			int temp = arr[i];
    			arr[i] = arr[largest];
    			arr[largest] = temp;
    			max_heap(arr, largest, length);
    		}
    }
}
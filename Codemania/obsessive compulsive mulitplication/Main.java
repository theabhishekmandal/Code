import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{

    static long start;
    static long stop;
    static int maxint = Integer.MAX_VALUE;
    static int minint = Integer.MIN_VALUE;
    static void debug(Object... a){
    	err.println(Arrays.deepToString(a));
    }
    static void starttime(){start = currentTimeMillis();}
    static void stoptime(){stop = currentTimeMillis();}
    static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}

    static class FastReader{
    StringTokenizer st;
    BufferedReader br;
    FastReader(){
        br = new BufferedReader(new InputStreamReader(in));
    }
    String n(){
        while(st == null || !st.hasMoreElements()){
	    try{
	    st = new StringTokenizer(br.readLine());
	    }
	    catch(Exception e){
	    e.printStackTrace();
	    }
	}
	    return st.nextToken();
    }

    int ni(){
        return Integer.parseInt(n());
    }
    float nf(){
        return Float.parseFloat(n());
    }

    double nd(){
        return Double.parseDouble(n());
    }
    long nl(){
        return Long.parseLong(n());
    }
    String ns(){
        String k="";
	    try{
	       k = br.readLine();
        }
        catch(Exception e){

	       e.printStackTrace();
        }
        return k;

    }
  }
    public static void main(String args[]) throws IOException{
		FastReader in = new FastReader();
		int t = in.ni();
    	for(int test = 1; test <= t; test++)
	//	{
            solve(in); //, test);
    //  }
    }
     static void solve(FastReader in){
        int n = in.ni();
        long arr[] = new long[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nl();
        }
        int minusone = 0;
        int one = 0;
        int other = 0;
        long number = 0L;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0L)
                continue;
            else if(arr[i] == 1L)
                    one++;
            else if(arr[i] == -1L){
                minusone++;
                }
            else{
                other++;
            }
            }
            if(other > 1) out.println("NOT OK");
            else if(minusone == 1 && others == 1) out.println("NOT OK");
            else if(minusone % 2 == 0 && minusone != 0 && one == 0) out.println("NOT OK");
            else out.println("OK");
        }
    }    
 

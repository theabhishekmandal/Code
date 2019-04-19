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
    private static long mod = 1000000000L + 7L;
    public static void main(String args[]) throws IOException{
        FastReader in = new FastReader();
        int t = in.ni();
        for(int test = 1; test <= t; test++)
            //  {
            solve(in); //, test);
        //  }
    }
    static void solve(FastReader in){
    	long n = in.nl();
    	int w = in.ni();
    	long count = 0L;
    	
        if(w <= 8 && w >= -9){
        	/*
        		counting number of pairs which will have diff w between 
        		first and last digit because in the question it is given 
        		for summation of i = 2 to n (Di - Di-1)

        		when you will expand this only the first and the last 
        		element will be present

        		also the weight will be between -9 to 8 because the
        		first digits can only contain values from 1 to 9 
        		whereas the last digit can contain values from 0 to 9
        	*/  
        	if(w >= 0)
        		count = 9 - w;
        	else
        		count = 10 - Math.abs(w);  // because weight is negative	
        }
        // we need fast exponentiation to find the combination of the rest 
		// of the digits between the first digit and the last digit modulo 
		// mod
        out.println((count * fastexpo(10L, n - 2L)) % mod);   	
    }
    static long fastexpo(long ten, long power){
    	long ans = 1L;
    	while(power > 0){
    		// if the power is odd then multiply one base to the ans
    		if(power % 2  == 1) ans = (1L * ans * ten) % mod;
    		
    		// now multiply the base with itself
    		ten = (ten * ten) % mod;
    		// dividing the power if it is odd then it will get rounded to 
			// nearest integer
    		power/= 2;    		
    	}
    	//debug(ans);
    	return ans;
    }                                                              
}

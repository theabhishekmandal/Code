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
        		first and last digit
        	*/  
        	if(w >= 0)
        		count = 9 - w;
        	else
        		count = 10 - Math.abs(w);  // because weight is negative	
        }
        out.println((count * fastexpo(10L, n - 2L)) % mod);   	
    }
    static long fastexpo(long ten, long power){
    	long ans = 1L;
    	while(power > 0){
    		if(power % 2  == 1) ans = (1L * ans * ten) % mod;
    		ten = (ten * ten) % mod;
    		power/= 2;    		
    	}
    	//debug(ans);
    	return ans;
    }                                                              
}
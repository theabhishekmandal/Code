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
    	long fre[] = new long[2001];
    	for(int i = 0; i < n; i++){
    		fre[in.ni() + 1000]++;
    	}
    	long count = 0L;
    	for(int i = 0; i < fre.length; i++){
    		for(int j = 0; j < fre.length; j++){
    			if((i + j) % 2 ==0 && fre[(i + j) / 2] > 0 && fre[i] > 0 && fre[j] > 0){
					if(i != j)
						count += fre[i] * fre[j] * 1L;
					else
						count += fre[i] * (fre[j] - 1) *1L;   			
    			}
    		}
    		}
    	out.println(count / 2);
     }
}
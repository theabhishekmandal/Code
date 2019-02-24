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
       // int t = in.ni();
        //  for(int test = 1; test <= t; test++)
        //  {
        solve(in); //, test);
        //  }
    }
    static void solve(FastReader in){
        long k = in.nl();
        long n = in.nl();
        long primes[] = new long[(int) k];
        for(int i = 0; i < primes.length; i++)
            primes[i] = in.nl();
        while(n-- > 0){
            long a = in.nl();
            long b= in.nl();
            out.println(foo(b,primes) - foo(a - 1,primes));
        }
    }
    static long foo(long n, long[]  arr){
        long count = 0;
        for(int i = 1; i < (1 << arr.length); i++){
            long sum = 1;
            long counter = 0;
            for(int j = 0; j < arr.length; j++){
                if((i & (1 << j)) != 0){
                    sum *= arr[j];
                    counter++;
                }
            }
            count = (counter % 2 == 0)? count - n / sum: count + n / sum;
        }
        return count;
    }
}


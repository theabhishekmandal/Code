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
    static long mod = (long)1e9 + 7L;
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
    static class pair<First, Second>{
		First first;
		Second second;
		pair(First first,Second second){
			this.first = first;
			this.second = second;
		}
		@Override
		public String toString(){
			return (first + " " + second);
		}
		@Override
		public boolean equals(Object o){
			if(this == o)
				return true;
			if(o == null || getClass() != o.getClass())
				return false;
			pair<?,?> pair = (pair<?, ?>) o;
			if(!first.equals(pair.first)) return false;
			return second.equals(pair.second);
		}
		@Override
		public int hashCode(){
			return 31 * first.hashCode() + second.hashCode();
		}
	}
    
    public static void main(String args[]) throws IOException{
        FastReader in = new FastReader();
        starttime();
        solve(in);
        stoptime();
    }
    static void solve(FastReader in){
       int t = in.ni();
       while(t-- > 0){
           int m = in.ni();
           int n = in.ni();
           long fibs[] = null;
           long a = 0L;
           for(int i = 0; i < m; i++) a = (a + in.ni()) % mod;
           a = (a * m) % mod;
           long b = 0L;
           for(int i = 0; i < m; i++) b = (b + in.ni()) % mod;
           b = (b * m) % mod;
           fibs = new long[Math.max(n, 2)];
           fibs[0] = a;
           fibs[1] = b;
           for(int i = 2; i < n; i++) fibs[i] = (fibs[i - 1] + fibs[i - 2]) % mod;    
           out.println(fibs[n - 1]);
       }
    }
}

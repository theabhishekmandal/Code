import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main{

    static long start, stop, mod = (long) 1e9 + 7L;
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
        /**
         * In this problem we have 1e5 test cases and 1e9 number for each test case. So in this a linear solution is not prefferable
         * and we need log n time solution. So binary search is preffered. First we calculate values in the form of 2^x + 2^y where 0<=x,y<=30
         * because x can be log2(1e9) which is approximately equal to 30.
         * 
         * Then we sort the values to perform the binary search. if n is smaller than 3 than we print 0 as minimum number that can be form 
         * using 2 as a base is 2^0 + 2^1 = 3.
         * 
         * if a number n already found in the list than the answer is always zero because it already exists in the form of 2^x + 2^y.
         * else the min is found between the lower match value and the higher match value in the list. 
         */
        TreeSet<Long> arr = new TreeSet<>();
        for(int i = 0; i <= 30; i++){
            for(int j = 0; j <= 30; j++){
                if(i != j){
                    arr.add((long)Math.pow(2, i) + (long)Math.pow(2, j));
                }
            }
        }
        int t = in.ni();
        while(t-- > 0){
            long n = in.nl();
            long ans = 0;
            if(n < 3) ans = 3 - n;
            else{
                ans = Math.min(n - arr.floor(n), arr.ceiling(n) - n);
            }
            out.println(ans);
        }
    }
}

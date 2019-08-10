import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;

/**
 * This problem is solved.
 * According to the problem, there are two person, first person distributes by keeping one apple in each box i.e 
 * he is following (n / k) where n is number of apples and k is number of boxes.
 * 
 * The second person follows a different method,  while the second one chooses a random box with the smallest
 *  number of apples and puts K apples in it
 * 
 * Solution:
 * if first follows n / k, 
 * the second one follows:
 *  if there are n apples and k boxes, then n / k gives us number of k apples grouped at a time. For eg: if n = 24 and k = 3 then n / k = 8
 * which means 8 groups are there each having 3 apples.
 * 
 * now we have to check if these groups can be divided equally in k boxes equally, if not the answer is "YES" else the answer is "NO", eg:
 * 8 % 3 = 2, i.e the groups cannot be divided equally so the answer is "YES"
 */
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
    static class pair<First extends Comparable<? super First>,
     Second extends Comparable<? super Second>> implements Comparable<pair<First, Second>>{
		public final First first;
		public final Second second;
		pair(First first,Second second){
			this.first = first;
			this.second = second;
		}
		public First getFirst(){
			return this.first;
		}
		public Second getSecond(){
			return this.second;
		}
		@Override
		public String toString(){
			return  "[" + first + " " + second + "]";
        }
        @Override
        public int compareTo(pair<First, Second> pair){
            int res = this.first.compareTo(pair.first);
            return res == 0 ? this.second.compareTo(pair.second) : res; 
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
            //gettime();
    }
    static void solve(FastReader in){
        int t = in.ni();
        while(t-- > 0){
            long n = in.nl();
            long k = in.nl();
            long answer = (long) (n / k);
            if(answer % k == 0L){
                out.println("NO");
            }
            else{
                out.println("YES");
            }
        }
    }
}


// this is working fine
/*

static void solve(FastReader in){
        int t = in.ni();
        while(t-- > 0){
            String n = in.n().trim();
            String k = in.n().trim();
            BigInteger nBigInteger = new BigInteger(n);
            BigInteger kBigInteger = new BigInteger(k);
            BigInteger ans = nBigInteger.divide(kBigInteger);
            nBigInteger = ans.mod(kBigInteger);
            if(nBigInteger.intValue() == 0){
                out.println("NO");
            }
            else{
                out.println("YES");
            }
        }
    }
*/
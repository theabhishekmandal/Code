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
    static long mod = 1000000000L + 7L;
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
        //    int t = in.ni();
        //    for(int test = 1; test <= t; test++)
        solve(in); //, test);
    }
    static void solve(FastReader in){
        /**
         * For this problem we know that total possible outcomes will be 10^n where n is the digits length
         * for calculating p we have to find the number of palindromes that occur in a given digit length.
         * For example: if n = 2 then q is 100 including 00, then to calculate p we know that palindrome string
         * occur in "AA" order. For the value of A we have 10 possible digits. so p = 10 and q = 100
         * 
         * For n = 3, palindrome sequence occur in form "ABA" then possible values for A and B is 10 so p = 100
         * and q = 10 ^ 3
         * 
         * For n = 4, "ABBA" p = 100, q = 1000
         * For n = 5, "ABCBA" p = 10 * 10 * 10 and q = 10000
         * For n = 6, "ABCCBA" p = 1000 and q = 100000
         * 
         * so in the above situation we see that if q = 10 ^ n then p = 10 ^ ceil(n / 2.0)
         */
        int t = in.ni();
        while(t-- > 0){
            int n = in.ni();
            int small = (int) Math.ceil(n * 0.5);
            StringBuilder br = new StringBuilder("1");
            for(int i = 0; i < n - small; i++) br.append("0");
            out.println(1 + " " + br.toString());
        }
    }
}

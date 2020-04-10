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
    static class pair<First extends Comparable<? super First>,
     Second extends Comparable<? super Second>> implements Comparable<pair<First, Second>>{
		public First first;
		public Second second;
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
        public void setFirst(First first){
            this.first = first;
        }
        public void setSecond(Second second){
            this.second = second;
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
		int n = in.ni();
		while(n--> 0){
			int l1 = in.ni();
			int r1 = in.ni();
			int l2 = in.ni();
			int r2 = in.ni();
			String ans = "";
			if(r1 == l2) ans = r1  + " " + r2;
			else if(l1 == l2 && r1 == r2) ans = l1  + " " + r2;
			else if(l1 == r2) ans = l1  + " " + l2;
			else ans = l1 + " " + l2; 
			System.out.println(ans);
		}
    }
}

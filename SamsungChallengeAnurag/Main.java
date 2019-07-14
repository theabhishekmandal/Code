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
		public First getFirst(){
			return this.first;
		}
		public Second getSecond(){
			return this.second;
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
            //gettime();
    }
    static void solve(FastReader in){
        int t = in.ni();
        while(t-- > 0){
            int n = in.ni();
            String[][] arr = new String[n][n];
            for(int i = 0; i < arr.length; i++)
                for(int j = 0; j < arr.length; j++)
                    arr[i][j] = in.n().trim();
            max = Integer.MIN_VALUE;
            counter = 1;
            solve(arr, n - 1, n - 1, 0);
            out.println(max + " " + counter);
        }  
    }
    static boolean isInt(String s){
        try{
            Integer.parseInt(s);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    static int max, counter;
    static void solve(String[][] arr, int i, int j, int count){
        if(i < 0 || j < 0) return;
        if(i == 0 && j == 0){
            if(max == count) counter++;
            max = Math.max(max, count);
            return;
        } 
        if(isInt(arr[i][j])) count += Integer.parseInt(arr[i][j]);
        solve(arr, i - 1, j, count);
        solve(arr, i - 1, j - 1, count);
        solve(arr, i, j - 1, count);
    }
}

import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
import java.util.stream.*;
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
        int target = in.ni();
        int[] arr = Stream.of(in.ns().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        out.println(Arrays.toString(twoSum(arr, target)));
    }
    /**
     * Here the put method is added after checking of key coz
     * we want to save the newest key value pair, if a key appear two times then we would get the latest value
     * 
     * else always remember checking a value in a map should be a step behind adding it to the map
     */
    static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }
}

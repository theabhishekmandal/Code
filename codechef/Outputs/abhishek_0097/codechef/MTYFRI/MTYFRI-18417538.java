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
        int t = in.ni();
        for(int test = 1; test <= t; test++)
            solve(in); //, test);
    }
    static void solve(FastReader in){
    	int n = in.ni();
    	int k = in.ni();
    	int motu[] = new int[(int)Math.ceil(n / 2.0)];
    	int tomu[] = new int[(int)Math.floor(n / 2.0)];
    	int counter1 = 0;
    	int counter2 = 0;
    	long tom = 0L;
    	long mot = 0L;
    	for(int i = 0; i < n; i++){
    		if((i & 1) == 1){
    			tomu[counter1] = in.ni();
    			tom += tomu[counter1];
    			counter1++;
    		}
    		else{
    			motu[counter2] = in.ni();
    			mot += motu[counter2];
    			counter2++;
    		}
    	}
    	if(k != 0 && mot >= tom){
    		Arrays.sort(motu);  // pick from last
    		//Arrays.reverse();
         	Arrays.sort(tomu);       // pick from front
         	long large = 0L;
         	long small = 0L;
         	for(int j = 0; j < k; j++){
         		if(j >= tomu.length) break;
         		small += tomu[j];
         		large += motu[motu.length - j - 1];
         	}
         	mot = mot - large + small;
         	tom = tom - small + large;
    	}
    		if(mot >= tom) out.println("NO");
    		else out.println("YES");    	 	
    	
    }
}
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
			pair<?,?> pair = (pair<?,?>) o;
			if(!first.equals(pair.first)) return false;
			return second.equals(pair.second);
		}
		@Override
		public int hashCode(){
			return 31 * first.hashCode() + second.hashCode();
		}
	}
    
    public static void main(String args[]) throws IOException{
        try{
            FastReader in = new FastReader();
        	starttime();
            solve(in);
        }finally{
            stoptime();
        }
    }
    static void solve(FastReader in){
        int t = in.ni();
        while(t-- > 0){
            int d = in.ni();
            String string = in.ns().trim();
            int presentcounter = 0;
            for(int i = 0; i < string.length(); i++) if(string.charAt(i) == 'P') presentcounter++;
            double value =  presentcounter / (double)d;
            if(value >= 0.75){
                out.println(0);
            }
            else{
                int proxies = 0;
                for(int i = 2; i < string.length() - 2; i++){
                    if(string.charAt(i) == 'A' && ((string.charAt(i - 2) == 'P' || string.charAt(i - 1) == 'P') && 
                    (string.charAt(i + 1) == 'P' || string.charAt(i + 2) == 'P'))){
                        proxies++;
                        value = (presentcounter + proxies) / (double)d;
                        if(value >= 0.75) break;
                    }
                }
                //value = (presentcounter + proxies) / (double)d;
                if(value >= 0.75){
                    out.println(proxies);
                }
                else out.println(-1);
            }
        }   
    }
}

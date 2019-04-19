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
        int n = in.ni();
        while(n-- > 0){
            String hello = in.ns();
            out.println(getans(hello));
        }
    }
    static String getans(String hel){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Set<Character> set = new HashSet<>(Arrays.asList('(', '{', '['));
        for(int i = 0; i < hel.length(); i++){
            char temp = hel.charAt(i);
            if(set.contains(temp)) stack.push(temp);
            else if(!stack.isEmpty() && stack.peek() == map.get(temp)) stack.pop();
            else{
                return "NO";
            }
        }
        // extra stack check if any bracket remains 
        if (!stack.isEmpty())
            return "NO";
        return "YES";
    }
}

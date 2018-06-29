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
    public static void main(String args[]) throws IOException{
        FastReader in = new FastReader();
        //	int t = in.ni();
        //	for(int test = 1; test <= t; test++)
        //	{
        solve(in); //, test);
        //  }
    }
    static void solve(FastReader in){
        int n = in.ni();
        int m = in.ni();
        int arr[] = new int[n + 1];
        ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 1; i < n; i++){
            int a = in.ni();
            int b = in.ni();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean[] visit = new boolean[n + 1];
        int path[][] = new int[m][2];
        for(int i = 0; i < m; i++){
            int src = in.ni();
            int des = in.ni();
            check = false;
            foo(graph, src, des, visit, arr);
        }
        int max = minint;
        for(int i: arr){
        	max = Math.max(max, i);	
        }
        out.println(max);

    }
    static  boolean check = false;
    static void foo(ArrayList<ArrayList<Integer>> graph, int src, int des, boolean[] visit, int[] arr){
        visit[src] = true;
        arr[src]++;
        if(src == des){
           check = true;
        }
        else{
            for(int i: graph.get(src)){
                if(!visit[i]){
                    foo(graph, i, des, visit, arr);
                }
            }
        }
        visit[src] = false;
        if(!check)
        arr[src]--;
    }
}


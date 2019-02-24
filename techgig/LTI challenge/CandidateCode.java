import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class CandidateCode{

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
        long arr[][] = new long[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nl();
            }
        }
        HashMap<Long, Integer> visit = new HashMap<>();
        long cost[][] = new long[n][m];
        cost[0][0] = 0;
        for(int i = 1; i < n; i++){
            if(arr[i][0] > 0) {
                if (visit.get(arr[i][0]) == null) {
                    visit.put(arr[i][0], 1);
                } else if (visit.get(arr[i][0]) < 2) {
                    visit.put(arr[i][0], visit.get(arr[i][0]) + 1);
                }
                cost[i][0] = (visit.get(arr[i][0]) == 2)? 2: cost[i - 1][0] + 1;
            }
            else if(arr[i][0] < 0){
                cost[i][0] = 1 + -1 * arr[i][0] + cost[i - 1][0];
            }

        }
        for(int i = 1; i < m; i++){
            if(arr[0][i] > 0) {
                if (visit.get(arr[0][i]) == null) {
                    visit.put(arr[0][i], 1);
                }
                else if(visit.get(arr[0][i]) < 2){
                    visit.put(arr[0][i], visit.get(arr[0][i]) + 1);
                }
                cost[0][i] = (visit.get(arr[0][i]) == 2)?  2: 1 + cost[0][i - 1];
            }
            else if(arr[0][i] < 0){
                cost[0][i] = 1 + -1 * arr[0][i - 1] + cost[0][i - 1];
            }
        }
        for(int i= 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[i][j] > 0 || i + j == n + m - 2){
                    if(visit.get(arr[i][j]) == null){
                        visit.put(arr[i][j], 1);
                    }
                    else if(visit.get(arr[i][j]) < 2){
                        visit.put(arr[i][j], visit.get(arr[i][j] + 1));
                    }
                    cost[i][j] = (visit.get(arr[i][j]) == 2)? 2: 1 + Math.min(cost[i - 1][j], cost[i][j - 1]);
                }
                else if(arr[i][j] < 0){
                    cost[i][j] = 1 + Math.min(cost[i - 1][j], cost[i][j - 1]) + -1 * arr[i][j];
                }
            }
        }
        out.println(cost[n - 1][m - 1]);
    }
}

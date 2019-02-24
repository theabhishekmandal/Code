import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
import static java.lang.System.*;
public class Main
{
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
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int c[][] = new int[n][m];
        for(int i = 0 ;i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = in.ni();
            }
        }
        in.ns();
        for(int i = 0 ;i < n; i++){
            for(int j = 0; j < m; j++){
                b[i][j] = in.ni();
                c[i][j] = a[i][j] ^ b[i][j];
            }
        }

        if(n < 3 || m < 3){
            out.println(-1);
        }
        else{
            int count = 0;
            for(int i = 0; i < n; i += 3){
                for(int j = 0; j < m; j +=3){
                    int rowlen = Math.min(i + 3, n);
                    int collen = Math.min(j + 3, m);
                    int k = i;
                    while(k < rowlen){
                        boolean check = false;
                        int l = j;
                        while(l < collen){
                            if(c[k][l] == 1){
                                count++;
                                check = true;
                                break;
                            }
                            l++;
                        }
                        if(check)
                            break;
                        k++;
                    }

                }
            }
            out.println(count);
        }
    }
    
 }

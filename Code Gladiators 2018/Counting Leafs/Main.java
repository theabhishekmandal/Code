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
    static int aleaf = 0;
    static void solve(FastReader in){
        int n = in.ni();
        ArrayList<Integer>[] tree = new ArrayList[n];
        ArrayList<Integer> leaves = new ArrayList<>();
        //Initally everyone is leaves
        for(int i = 0; i < n; i++){
            tree[i] = new ArrayList<>();
            leaves.add(i);
        }
        for(int i = 0; i < n; i++){
            int k = in.ni();
            if(k != -1){
                // it means k is the parent 
                if(leaves.contains(k)){// removing parent from the leaves
                    int index = leaves.indexOf(k);
                    leaves.remove(index);
                    tree[k].add(i);
                }
                else{// adding the children
                    tree[k].add(i);
                }
            }
        }
        int node = in.ni();
        // the node to be deleted is  a leaf 
        if(leaves.contains(node)){
            out.println(leaves.size() - 1);
        }
        else{
            foo(tree, leaves, node);
            out.println(leaves.size());
        }
    }
    public static void foo(ArrayList<Integer>[] arr, ArrayList<Integer> leaves, int node){
        for(int i = 0; i < arr[node].size(); i++){
            int data = arr[node].get(i);
            if(leaves.contains(data)){
                int index = leaves.indexOf(data);
                leaves.remove(index);
            }
            else{
                foo(arr, leaves, data);
            }
        }
    } 
}

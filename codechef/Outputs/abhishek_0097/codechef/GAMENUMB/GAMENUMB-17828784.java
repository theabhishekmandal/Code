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
    static void debug(Object... a)
    {
        err.println(Arrays.deepToString(a));
    }
    static void starttime(){start = currentTimeMillis();}
    static void stoptime(){stop = currentTimeMillis();}
    static void gettime(){err.println(((double)(stop - start) / 1000.0) + " seconds");}
    static class FastReader
    {
        StringTokenizer st;
        BufferedReader br;
        FastReader()
        {
            br = new BufferedReader(new InputStreamReader(in));
        }
        String n()
        {
            while(st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int ni()
        {
            return Integer.parseInt(n());
        }
        float nf()
        {
            return Float.parseFloat(n());
        }

        double nd()
        {
            return Double.parseDouble(n());
        }

        long nl()
        {
            return Long.parseLong(n());
        }
        String ns()
        {
            String k="";
            try
            {
                k = br.readLine();
            }
            catch(Exception e)
            {

                e.printStackTrace();
            }
            return k;

        }
    }
    public static void main(String args[]) throws IOException
    {
        FastReader in = new FastReader();
        int t = in.ni();
        for(int test = 1; test <= t; test++)
            //	{
            solve(in); //, test);
        //  }
    }
    static void solve(FastReader in)
    {
        int n = in.ni();
        int k = in.ni();
        Cards[] cards = new Cards[n];
        int a[] = new int[n];
        int d[] = new int[n];
        for(int i = 0 ; i < a.length; i++)
            a[i] = in.ni();
        Long total = 0L;
        for(int i = 0 ; i < a.length; i++){
            d[i] = in.ni();
            total += d[i];
        }
         long b[] = new long[k];
        for(int i = 0 ; i < b.length; i++){
            b[i] = in.nl();
        }

        for(int i = 0; i < cards.length; i++)
        {
            cards[i] = new Cards(a[i], d[i]);
        }
        Arrays.sort(cards);
        long r = total;
        long l = 0L;
        for(int i = 0; i < b.length; i++){
            if(i %2 == 0){
                l = r - b[i];
            }
            else{
                r = l + b[i];
            }
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += Math.min(r,cards[i].d) * cards[i].a;
            r -= Math.min(r, cards[i].d);
            ans -= Math.min(l, cards[i].d) * cards[i].a;
            l -= Math.min(l, cards[i].d);
        }
        out.println(ans);


    }
   static class Cards implements Comparable<Cards>{

        int a;
        int d;
        Cards(int a, int d){
            this.a = a;
            this.d = d;
        }
        public int compareTo(Cards card){
            return this.a - card.a;
        }
    }

}
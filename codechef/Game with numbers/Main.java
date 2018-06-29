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
            //  {
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
        /*
            A[] = {1,2, 3, 4}
            d[]= {2, 2, 2, 2}
            then total number of cards total[] = {1, 1, 2, 2, 3, 3, 4, 4} 
        */
        // storing the value of the cards 
        for(int i = 0 ; i < a.length; i++)
            a[i] = in.ni();
        Long total = 0L;
        // storing the number of cards with a given value
        for(int i = 0 ; i < a.length; i++){
            d[i] = in.ni();
            total += d[i];
        }
         long b[] = new long[k];
        // storing the number of cards to be chosen in each operation by chef or chefu
        for(int i = 0 ; i < b.length; i++){
            b[i] = in.nl();
        }
        // storing the number of cards with their respective value 
        // and sorting them on the basis of A[] i.e the value written on the card
        // we are not sorting the full sequence because their are lot of duplicate elements
        for(int i = 0; i < cards.length; i++)
        {
            cards[i] = new Cards(a[i], d[i]);
        }
        Arrays.sort(cards);

        /*
        now calculating the range which will come after chef and chefu have selected their cards
        we will calculate the answer of the range (l, r) below
        l for chefu and r for chef
        */
        long r = total;
        long l = 0L;
        for(int i = 0; i < b.length; i++){
            if(i %2 == 0){
                /*
                if you have total of 10 items and you want to select the 2 items such that max value is attained
                Then we shift the left pointer to 10 - 2 = 8 places front. Thus this is for selecting max cards
                */
                l = r - b[i];
            }
            else{
                // This is for selecting min values
                r = l + b[i];
            }
        }
        /**
         * Also remeber that the above range which is computed is in the form
         * [l, r) i.e l is inclusive and r is exclusive
         */
        long ans = 0;
        /**
         * To calculate the answer we add the value of all the cards from 0 to r.
         * For this first we find the minimum between the current number of cards and the r
         * and reduce the value of the r.
         * 
         * In the next Iteration we find the minimum value of from 0 to l and subtract it from the answer
         */
        for(int i = 0; i < n; i++){
            ans += Math.min(r,cards[i].d) * cards[i].a;
            r -= Math.min(r, cards[i].d);
        }
        for(int i = 0; i < n; i++){
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

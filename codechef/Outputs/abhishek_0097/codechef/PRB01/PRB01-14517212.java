import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Main
{
    public static boolean isprime(int n)
    {
        if(n<2) return false;
        if(n<=3)return true;
        if(n%2==0||n%3==0) return false;
        else
        {
            for(int i=5;i*i<=n;i+=6)
            {
                if(n%i==0||n%(i+2)==0)
                    return false;
            }
        }
        return true;
    }
    public void Solve(PrintStream out,FastReader s)
    {
        int n=s.nextInt();
        while(n-->0)
        {
            if(isprime(s.nextInt()))
             out.println("yes");
         else
            out.println("no");

            
        }

    }
    static class FastReader
    {
        StringTokenizer st;
        BufferedReader br;
        FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        float nextFloat()
        {
            return Float.parseFloat(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String k=null;
            try
            {
                k=br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return k;
        }
        String next()
        {
            while(st==null||!st.hasMoreElements())
            {
                try{
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }
    public static void main(String args[])
    {
        Main t=new Main();
        t.Solve(System.out,new FastReader());

    }
    
}
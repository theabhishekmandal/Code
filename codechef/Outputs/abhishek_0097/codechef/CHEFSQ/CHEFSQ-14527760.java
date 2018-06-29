import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Main
{
   
    public void Solve(PrintStream out,FastReader s)
    {
        int n=s.nextInt();
        while(n-->0)
        {
            int f=s.nextInt();
            int a[]=new int[f];
            for(int i=0;i<f;i++)
                a[i]=s.nextInt();

            int j=s.nextInt();
            int b[]=new int[j];
            for(int i=0;i<j;i++)
                b[i]=s.nextInt();
            int count=0;
            int k=0;
            for(int i=0;i<f;i++)
            {
                if(a[i]==b[k])
                    k++;
                if(k==j)
                    break;
            }
            if(k==j)
                out.println("Yes");
            else
                out.println("No");

            
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
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
           int t=s.nextInt();
           String correct=s.next();
           String candidate=s.next();
           int money[]=new int[t+1];
           for (int i=0; i<=t; i++) 
           {
             money[i]=s.nextInt();

           }
           int count=0;
           for(int i=0;i<correct.length();i++)
           {
            if(correct.charAt(i)==candidate.charAt(i))
                count++;
           }
           if(count==correct.length())
           out.println(money[count]);
       else
       {
        int max=0;
        for(int i=0;i<count+1;i++)
        {
            if(max<money[i])
                max=money[i];
        }
        out.println(max);

            
        }
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
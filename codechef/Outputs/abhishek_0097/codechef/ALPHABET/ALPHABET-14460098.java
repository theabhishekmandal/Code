/**
 * Created by abhishek mandal on 7/8/2017.
 */
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;
public class Main
{

    public void Solve(PrintStream out,FastReader s)
    {   try {
            char[] first = s.next().toCharArray();
            int n = s.nextInt();
            while (n-- > 0) {
                char[] second = s.next().toCharArray();
                boolean check = false;
                for (int i = 0; i < second.length; i++) {
                    check = false;
                    for (int j = 0; j < first.length; j++) {
                        if (first[j] == second[i]) {
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        out.println("No");
                        break;
                    }
                }
                if (check)
                    out.println("Yes");

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
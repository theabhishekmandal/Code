import java.io.*;
import java.util.*;
import java.lang.*;
public class Main
{
	public static int large=1000000000+7;
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
 public static int solve(int k,int a,int b)
 {
 	switch(k%6)
 	{
 		case 3:return b-a;
 		case 4:return -a;
 		case 5:return -b;
 		case 0:return a-b;
 		case 1:return a;
 		case 2:return b;

 	}
 	return 0;
 }

	public static void main(String args[])
	{
          FastReader s=new FastReader();
          int n=s.nextInt();
          while(n-->0)
          {
          	int a=s.nextInt();
          	int b=s.nextInt();
          	int t=s.nextInt();
          	int k=solve(t,a,b)%large;
          	k=(k<0)?(k+large):k;
          	System.out.println(k);

          }
	}
}
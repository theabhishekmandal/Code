import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.*;
public class Main
{
	private static final PrintWriter out = new PrintWriter(System.out,true);
	private static final PrintWriter err = new PrintWriter(System.err,true);
	static class FastReader
	{
		StringTokenizer st;
		BufferedReader br;
		FastReader()
		{
			br=new BufferedReader(new InputStreamReader(System.in));

		}


		String next()
		{
			while(st==null||!st.hasMoreElements())
			{
				try
				{
					st=new StringTokenizer(br.readLine());
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		float nextFloat()
		{
			return Float.parseFloat(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		String nextLine()
		{
			try
			{

				return br.readLine();

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			return "";

		}
		
	}
	public static void main(String args[]){

		FastReader s=new FastReader();
		int t=s.nextInt();
		while(t-->0)
			solve(s);

	}
	private static void solve(FastReader s)
	{
		String number=s.next();
		int sum=0;
		for(int i = 0;i<number.length();i++)
			sum+=number.charAt(i)-'0';

		int max=Integer.MIN_VALUE;
		int save=-1;
		for(int i = 0;i<number.length();i++)
		{
			int loc=sum-(number.charAt(i)-'0');
			if(loc >max && loc%3 == 0)
			{
				max=loc;
				save=i;
			}
		}
		if(save == -1 || number.length()==1)
			out.println(number+" "+-1);
		else
			out.println(number+" "+number.substring(0,save)+number.substring(save+1));

	}
}
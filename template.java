import java.util.*;
import java.io.*;
public class template
{
	private static PrintWriter out = new PrintWriter(System.out);
	static class FastReader
	{
		StringTokenizer st;
		BufferedReader br;
		FastReader()
		{
			br=new BufferedReader(new InputStreamReader(System.in));

		}


		String nexti()
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
			return Integer.parseInt(nexti());
		}

		float nextFloat()
		{
			return Float.parseFloat(nexti());
		}

		double nextDouble()
		{
			return Double.parseDouble(nexti());
		}

		long nextLong()
		{
			return Long.parseLong(nexti());
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
		String next()
		{
			String k="";
			try
			{

					k=br.readLine().split(" ")[0];

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return k;
		}

	}



	private void solve()
	{
		FastReader s=new FastReader();
		String string=s.next();
		String two=s.nextLine();
		int  one=s.nextInt();
		float fl=s.nextFloat();
		double dl=s.nextDouble();
		long ll=s.nextLong();
		out.println(string);
		out.println(two);
		out.println(one);
		out.println(fl);
		out.println(dl);
		out.println(ll);


	}

	public static void main(String args[]){
		new template().solve();
		out.flush();

	}
}
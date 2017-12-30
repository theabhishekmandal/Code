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



	private void solve()
	{
		FastReader s=new FastReader();
		int t=s.nextInt();
		while(t-->0)
		{
			//here we are considering that a is smaller than b otherwise the output will get changed				  
			int a=s.nextInt();
			String b=s.next();
			if(a==0)
				System.out.println(b);
			else if(b.equals("0"))
				System.out.println(a);
			else
			{
				int save=0;
				for(int i=0;i<b.length();i++)
				{
					save=((save*10)+(b.charAt(i)-'0'))%a;
				}
				while(save!=0)
				{
					int temp=save%a;
					a=save;
					save=temp;
					
				}
				System.out.println(a);
			}
		}		


	}

	public static void main(String args[]){
		new template().solve();
		out.flush();

	}
}
import java.util.*;
import java.io.*;
class template
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
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<arr.length;i++)
			{	
				arr[i]=s.nextInt();
			}
			int ans=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					      ans=Math.min(ans,lcm(arr[i],arr[j])) ;

				}
			}
			System.out.println(ans);	
		}
	
	}
	private int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
	private int gcd(int a,int b)
	{
		if(a==b)
			return a;
		if (a==0||b==0)
			return 0;
	    if(a>b)
	        return gcd(a-b,b);
	        return gcd(a,b-a);
	}

	public static void main(String args[]){
		new template().solve();
		out.flush();

	}
}
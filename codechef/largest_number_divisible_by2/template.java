import java.util.*;
import java.io.*;
public class template
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
		s.nextLine();
		while(t-->0){
		new template().solve(s);
		}

	}
	private void solve(FastReader s)
	{
		String number=s.nextLine();
		if(number.length()==1)
			out.println(number+" "+-1);
		else if(number.length()==2)
			{
				int one=number.charAt(0)-'0';
				int two=number.charAt(1)-'0';
				if(one%2==0)
					out.println(number+" "+one);
				else 
					out.println(number+" "+-1);
			}
		else if(number.length()>2)
		{
			if((number.charAt(number.length()-1)-'0')%2==0)
			{
				int first=number.charAt(0)-'0';
				int second=number.charAt(1)-'0';
				if(first>=second)
				{
					 int low=find(number,1,number.length()-1);
					 out.print(number+" ");
					 out.println(number.substring(0,low)+number.substring(low+1));
				}
				else if(second>first)
				{
					out.print(number+" ");
					out.println(number.substring(1));
				}
					
			}
			else
			{
				if((number.charAt(number.length()-2)-'0')%2==0)
				{
					out.println(number+" "+number.substring(0,number.length()-1));
				}
				else
					out.println(number+" "+-1);
			}	

		}


	}
	private int find(String num,int start,int end)
	{
		int max=999;
		int index=start;
		for(int i=start;i<end;i++)
		{
			int number=num.charAt(i)-'0';
			if(number>max)
			{
				index=i;
				max=number;
			}
		}
		return index;
	}
}
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
 

	public static void main(String args[])
	{
          FastReader s=new FastReader();
          int t=s.nextInt();

          while(t-->0)
          {
          	int n=s.nextInt();
          	int k=s.nextInt();
          ArrayList<String> dic=new ArrayList<String>();
          ArrayList<String> mod=new ArrayList<String>();
          	while(n-->0)
          	{
          		dic.add(s.next());
          	}
          	while(k-->0)
          	{
          		int l=s.nextInt();
          		while(l-->0)
          			mod.add(s.next());

          	}
          	for(int i=0;i<dic.size();i++){
          		if(mod.contains(dic.get(i))){
          		System.out.print("YES ");

          	}
          	else
          			System.out.print("NO ");
          }
          System.out.println();

          }
	}
}
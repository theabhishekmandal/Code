import java.util.*;
import java.io.*;
class graph
{
	
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			String one=s.next();
			String two=s.next();
			System.out.println(getoutput(one,two));
		}

	}
	private static String getoutput(String one,String two)
	{
		StringBuilder br=new StringBuilder();
			int len=Math.min(one.length(),two.length());
			for(int i=0;i<len;i++)
			{
				br.append(one.charAt(i)).append(two.charAt(i));
			}
			br.append(one.substring(len)).append(two.substring(len));
			return br.toString();
	}
}
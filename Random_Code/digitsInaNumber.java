import java.util.*;
import java.io.*;
import java.math.*;
class digitsInaNumber
{
	public static void main(String args[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int t=s.nextInt();
		while(t-->0)
		{
			BigInteger br=new BigInteger(s.next());
			BigInteger prev=new BigInteger("1");
			BigInteger next=new BigInteger("1");
			int save=0;

			int i=0; // shows number of digits
			while((next.compareTo(br)!=1))
			{
				prev=next;
				next=next.multiply(new BigInteger("3"));

				++i;

			}

			out.println(i);

		}
		out.flush();
	}
}
















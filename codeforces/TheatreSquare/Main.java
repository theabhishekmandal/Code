import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a=s.nextInt();
		BigInteger one=new BigInteger(Integer.toString((n+a-1)/a));
		BigInteger two=new BigInteger(Integer.toString((m+a-1)/a));
		System.out.println(one.multiply(two));
	
	}
	
}
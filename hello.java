import java.util.*;
public class hello
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int one=s.nextInt();
		int two=s.nextInt();
		System.out.println(gcd(one,two));
	}
	private static int gcd(int one,int two)
	{
		if(two==0)
			return one;
		return gcd(two,one%two);
	}
}

//Finding prime fastest
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		if(isprime(t))
			System.out.println("It is prime");
		else 
			System.out.println("It is not prime");
	}
	private static boolean isprime(int k)
	{
		if(k < 2) return false;
		if(k <= 3) return true;
		if(k % 2 == 0|| k % 3 == 0) return false;
		else
		{
			for(int i = 5; i * i <= k ; i++)
			{
				if(k % (i) == 0 || k % (i + 2) == 0)
				return false;
			}
		}
		return true;
	}
}
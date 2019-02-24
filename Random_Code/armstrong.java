import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int k = 0;
		String hello = Integer.toString((k = Integer.parseInt(s.next())));
		int sum = 0;
		for(int i = 0; i < hello.length(); i++)
		{
			int d = hello.charAt(i) - '0';
			sum += (int)Math.pow(d, hello.length());

		}
		if(sum == k)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");

	}
}
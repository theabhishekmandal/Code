import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println(get(a,b,c));
	}
	private static boolean get(int a,int b,int c)
	{
		int one=Math.abs(b-a);
		int two=Math.abs(c-a);
		int three=Math.abs(b-c);
		if((one<=1||two<=1)&&(one>=2||two>=2)&&three>=2)
		 return true;
		 return false;
	}
}
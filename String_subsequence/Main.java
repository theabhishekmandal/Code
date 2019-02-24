import java.util.*;
import java.io.*;
public class Main
{
	private static PrintWriter out  = new PrintWriter(System.out, true);
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		call(str,"");		
	}
	private static void call(String input, String output)
	{
		if(input.length() == 0)
		{
			out.println(output);
			return;
		}
		call(input.substring(1), output);
		call(input.substring(1), output + input.charAt(0));
	}
}
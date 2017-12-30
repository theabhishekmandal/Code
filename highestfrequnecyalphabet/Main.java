import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			String res=s.next();
			System.out.println(getfreq(res));
		}
	}
	private static String getfreq(String arr)
	{
		char one[]=new char[256];
		for(int i=0;i<arr.length();i++)
			one[arr.charAt(i)]++;
		int max=Integer.MIN_VALUE;
		char save='0';
	    for(int i=0;i<arr.length();i++)
	    {
	    	if(one[arr.charAt(i)]>max)
	    	{
	    		max=one[arr.charAt(i)];
	    		save=arr.charAt(i);
	    	}
	    }
	    return Character.toString(save);
	}
}

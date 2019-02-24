import java.util.*;
public class bread
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String one=s.nextLine();
		System.out.println(getSandwhich(one));
	}
	private static String getSandwhich(String one)
	{
		String hello[]=one.split(" ");
		String save="";
		int start=0;
		for(int i=0;i<hello.length;i++)
		{
			if(hello[i].equals("bread"))
			{
				 start=i;
				 break;
			}
		}
		int stop=0;
		for(int i=hello.length-1;i>=0;i--)
		{
			if(hello[i].equals("bread"))
			{
				 stop=i;
				 break;
			}
		}
		for(int i=start+1;i<stop;i++)
		{
			 save+=hello[i]+" ";
		}
		if(start!=stop)
			return  (" "+save);
	  return "";		

	 }
}
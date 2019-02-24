import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			String one=s.next();      //it should be small
			String two=s.next();       //it should be large
			System.out.println(isStringPresent(one,two));
		}  			
	}
	private static boolean isStringPresent(String one,String two)
	{
		char[] large=two.toCharArray();
		char []small=one.toCharArray();

		boolean check=false;
		for(int i=0;i<small.length;i++)
		{
		   check=false;
		   for(int j=0;j<large.length;j++)
		   {
		   		if(small[i]==large[j])
		   		{
		   			large[j]='\0';
		   			check=true;
		   			break;
		   		}
		   }
		   if(!check)
		   		return check;
		}
		return check;
	}
}
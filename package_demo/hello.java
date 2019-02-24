import java.util.*;
class hello
{
	public static String original(String input1)
	{
		String save="";
		save+=input1.charAt(0);
		if(input1.length()==1)
			return save;

		for(int i=1;i<input1.length();i++)
			{
				if(i%2==1)
					save=input1.charAt(i)+save;
				else
					save+=input1.charAt(i);
			}
			return save;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(original(s.nextLine()));
	}
}


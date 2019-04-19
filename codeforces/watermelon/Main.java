import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 int t=s.nextInt();
		 if (t<=2)
		 System.out.println("NO");
		 else
		 System.out.println(((t%2==0)?"YES":"NO"));
	}
}

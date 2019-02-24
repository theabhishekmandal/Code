public class test
{
	static <T extends Number> void hel(int k)
	{
		if(k == 0)
			return;
		System.out.println("hello abhishek");
		hel(k - 1);
	}
	public static void main(String arg[])
	{
		hel(2);
	}
}

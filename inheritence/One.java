class A
{
	void print()
	{
		System.out.println("hello A");
	}
	static class B
	{
		void print()
		{
			System.out.println("hello B");
		}	
	}
}


public class One
{
	public static void main(String args[])
	{
		A ob=new B();
		ob.print();
	}
}

import java.util.*;
class prime
{
	private static boolean isprime(int k)
	{
		if (k<2) return false;
		if(k<=3) return true;
		if(k%2==0 ||k%3 ==0) return false;
		else
		{
			for(int i=5;i*i<=k;i+=6)
			{
				if(k%i==0 || k%(i+2)==0)
					return false;
			}

		}
		return true;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting and the end range upto which you want to find the prime number");
		int start=s.nextInt();
		int end=s.nextInt();
		long first=System.currentTimeMillis();
		for(int i=start;i<=end;i++)
		{
			if(isprime(i))
				System.out.println(i);
		}
		long second=System.currentTimeMillis();
		System.out.println("time taken to process in milli seconds "+(second-first));
	}
}
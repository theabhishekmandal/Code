import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		System.out.println(getoutput(arr));
	}
	private static int getoutput(int arr[])
	{
		int sum=0;
		for(int i:arr)
			sum+=i;
		return sum;
	}
}
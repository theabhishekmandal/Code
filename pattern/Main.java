import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0)
		{
			int t=s.nextInt();
			solve(t);
			System.out.println();
		}
	}
	private static void solve(int n)
	{
		int star=1;
		int hash=n-1;
		int check=0;
		int limit=(int)Math.ceil(n/2);
		for(int i=1;i<=limit;i++)
		{
			
			 print(i,star,hash);
		     star++;
		     hash--;
		}
		star=n-limit;
		hash=limit;
		for(int i=limit+1;i<=n;i++)
		{
		    print(i,star,hash);
		     star--;
		     hash++;
		}
	}	
		private static void print(int i,int star,int hash)
		{
			
			if(i%2==1)
			{
			    for(int j=1;j<=star;j++)
			    	System.out.print("*");
			    for(int k=1;k<=hash;k++)
			    	System.out.print("#");
			    	System.out.println();
			}
			else
			{
				 for(int j=1;j<=hash;j++)
			    	System.out.print("#");
			    for(int k=1;k<=star;k++)
			    	System.out.print("*");
			    	System.out.println();
			}

		

		}
	
}      
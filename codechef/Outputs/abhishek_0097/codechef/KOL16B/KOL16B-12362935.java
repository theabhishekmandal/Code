import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
//number of test cases
int t,j=1;
t=a.nextInt();
while(j<=t)
{
	int n,x,y;
	//entering the size of the array
	n=a.nextInt();
	int b[]=new int[n];
	int c[]=new int[n];
	for(int i=0;i<n;i++)
	{
		b[i]=a.nextInt();
		x=b[i]>>16;
		y=x<<16;
		c[i]=b[i]^y;
		b[i]=x;
		
	}
	System.out.println("Case"+" "+j+":");
	for(int i=0;i<n;i++)
	{
		System.out.print(c[i]+" ");
	}
	System.out.print("\n");
	for(int i=0;i<n;i++)
	{
		System.out.print(b[i]+" ");
	}
	System.out.print("\n");
j++;
}
	}

}
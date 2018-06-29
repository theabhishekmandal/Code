import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int t;
		//entering how many test cases
		t=a.nextInt();
		while(t--!=0)
		{
			int n;
			//entering size of the array
			n=a.nextInt();
			int c[]=new int[n];
			int u[]=new int[n];
			//entering the elements of the array
			for(int i=0;i<n;i++)
			{
				c[i]=a.nextInt();
				u[i]=0;
			}
			int count=0,count2=0,count3=0;
			for(int i=0;i<n;i++)
			{
				if(c[i]<=n)
				{
					count++;
				
				 if(c[i]!=i+1)
				{
					count2++;
				}
				if(c[i]==u[c[i]-1])
					count3++;
				else 
					if(c[i]!=u[c[i]-1])
					{
						u[c[i]-1]=c[i];
					}
				}
		}
if(count==n&&count2>0&&count3==0)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
}
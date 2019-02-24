import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int t=s.nextInt();
try
{
for(int j=0;j<t;j++)
{
int n=s.nextInt();
int a[]=new int[n];
int one=0,neg=0,others=0,zero=0;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
	if(a[i]==1)
		one++;
	else
		if(a[i]==-1)
			neg++;
		else if(a[i]==0)
			zero++;
		else
			others++;
}
if(others==1)
{
	if(neg>0)
		System.out.println("no"); // 2 -1 0 1
	else
		System.out.println("yes");// 2 1 0 1
}
else if(others>1)
	System.out.println("no");// 2 3 1 0
else
{
	if(one==0&&neg>1)
		System.out.println("no");// -1 - 1 0
	else
		System.out.println("yes");//-1 -1 1 0

}
}
}
catch(Exception e)
{
	return;
}
}
}
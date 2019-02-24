import java.util.*;
class Main
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
	    
	    int n=s.nextInt();
	    int n2= s.nextInt();
	    int n3=s.nextInt();
	    int a[]=new int[n+n2+n3];
	    for(int i=0;i<a.length;i++)
	        a[i]=s.nextInt();
	   Arrays.sort(a);
	   int check=a[0],count=1,one=0;
	   ArrayList<Integer> arr=new ArrayList<Integer>();
	   for(int i=1;i<a.length;i++)
	   {
			   if(check==a[i])
				   count++;
			   else
			   {
				   if(count>=2)
					   arr.add(check);
				   count=1;
				   check=a[i];
			   }
		
	   }
	   System.out.println(arr.size());
	   for(int i=0;i<arr.size();i++)
		   System.out.println(arr.get(i));

}
}
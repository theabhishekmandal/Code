/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String save="";
		while (t-->0)
		{
		  String k[]=br.readLine().split(" ");
		  int n=Integer.parseInt(k[0]);
		  int p=Integer.parseInt(k[1]);
		  StringTokenizer st=new StringTokenizer(br.readLine());
		  int hard=0;
		  int cake=0;
		  for(int i=0;i<n;i++)
		  {
		  	int l=Integer.parseInt(st.nextToken());
		  	if (l<=((int)p/10))
		  	     hard++;
		  	else if(l>=(int)p/2)
		  	     cake++;
		  }
		  if (hard==2 && cake==1)
		     save+="yes\n";
		     else
		     save+="no\n";
		  
		}
		System.out.println(save);
	}
}
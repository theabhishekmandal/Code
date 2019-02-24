import java.util.*;
import java.io.*;
class Main
{
  static class FastReader
  {
    BufferedReader br;
    StringTokenizer st;
    FastReader()
    {
      br=new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
      while(st==null||!st.hasMoreElements())
      {
        try{
        st=new StringTokenizer(br.readLine());
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      }
      return st.nextToken();
    }
    double nextDouble()
    {
      return Double.parseDouble(next());
    }
    long nextLong()
    {
      return Long.parseLong(next());
    }
    float nextFloat()
    {
      return Float.parseFloat(next());
    }

    int nextInt()
    {
      return Integer.parseInt(next());
    }
    String nextLine()
    {
      String k="";
      try{
      k=br.readLine();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
      return k;
    }
  }
  public static void main(String args[])
  {
  FastReader s=new FastReader();
  int t=s.nextInt();
 		  while(t-->0)
 		  {
 		    int n=s.nextInt();
 		    int a[]=new int[n];
 		    int count=0;
 		    for(int i=0;i<n;i++)
 		    {
 		    a[i]=s.nextInt();
 		    if(a[i]==0) count++;
 		  }
 		  int count2=0; boolean check=false;
 		    for(int j=0;j<n;j++)
 		    {
 		      for(int i=0;i<n-1;)
 		      {
 		        if(a[i]<a[i+1])
 		        {
 		          int k=a[i];
 		          a[i]=a[i+1];
 		          a[i+1]=k;
 		          i+=2;
 		          check=true;
 		        }
 		        else
 		        i++;
 		      }
 		      if(check)
 		      {
 		    	  count2++;
 		    	  check=false;
 		      }

 		    }
 		    System.out.println(count2);
 		  }
  }
}
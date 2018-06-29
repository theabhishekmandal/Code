import java.util.*;
import java.io.*;
class Solution
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
   int a,n,k;
   a=s.nextInt();
   n=s.nextInt();
   k=s.nextInt();
   int arr[]=new int[k];
   Arrays.fill(arr,0);
   for(int i=0;i<k;i++)
   {
     arr[i]=a%(n+1);
     a/=(n+1);
     System.out.print(arr[i]+" ");
   }
  }
}
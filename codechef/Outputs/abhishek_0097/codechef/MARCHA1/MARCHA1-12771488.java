import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner br=new Scanner(System.in);
    int t=br.nextInt();
    while(t-->0)
    {
      int n=br.nextInt();
      int m=br.nextInt();
      int a[]=new int[n];
      String k="No";
      for(int i=0;i<n;i++)
      a[i]=br.nextInt();
      for(int i=1;i<(1<<n);i++)
      {  int sum=0;
        for(int j=0;j<n;j++)
        {
          if((i&(1<<j))!=0)
          {
            sum=sum+a[j];
          }
        }
        if (sum==m)
         {
           k="Yes";
           break;
         }
      }
      System.out.println(k);
    }
  }
}